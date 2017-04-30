package autoquote;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

public class CoverageDAO {
	
	private DataSource dataSource;
    
    public DataSource getDataSource() {
    	return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource;
    }
    
    public boolean insert(Coverage coverages) {
    	
    	boolean success = false;
    	
		String sql = "INSERT INTO my_autopolicy.coverage "
				+ "( coveragetype, vehusageType, milesday,  liabilitycoverage) "
				+ "VALUES ( ?, ?, ?, ? )";
		Connection conn = null;
		

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, coverages.getCoveragetype());	
			ps.setString(2, coverages.getVehusageType());
			ps.setString(3, coverages.getMilesday());
			ps.setString(4, coverages.getLiabilitycoverage());
			ps.executeUpdate();
			ps.close();
			System.out.println("Coverage data updated successfully!");
			success = true;

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		
		return success;
	}

}
