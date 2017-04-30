package autoquote;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

public class VehicleDAO {
	
	private DataSource dataSource;
    
    public DataSource getDataSource() {
    	return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource;
    }
    
    public boolean insert(Vehicle vehicles) {
    	
    	boolean success = false;
    	
		String sql = "INSERT INTO my_autopolicy.vehicle "
				+ "( vehnum, modelyear, make,  model, vinnumber) "
				+ "VALUES ( ?, ?, ?, ?, ? )";
		Connection conn = null;
		

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehicles.getVehnum());	
			ps.setString(2, vehicles.getModelyear());
			ps.setString(3, vehicles.getMake());
			ps.setString(4, vehicles.getModel());
			ps.setString(5, vehicles.getVinnumber());
			ps.executeUpdate();
			ps.close();
			System.out.println("Vehicle data updated successfully!");
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