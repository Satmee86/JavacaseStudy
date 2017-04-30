package autoquote;

import org.hibernate.validator.constraints.NotEmpty;


public class Coverage {
	
	@NotEmpty(message = "Please select coverage type.")
	String coveragetype;

	@NotEmpty(message = "Please select vehicle usage type.")
	String vehusageType;
	
	@NotEmpty(message = "Please select miles per day.")
	String milesday;
	
	@NotEmpty(message = "Please select liability coverage")
	String liabilitycoverage;
	
	
	
	public String getCoveragetype() {
		return coveragetype;
	}

	public void setCoveragetype(String coveragetype	) {
		this.coveragetype = coveragetype;
	}

	public String getVehusageType() {
		return vehusageType;
	}

	public void setVehusageType(String vehusageType) {
		this.vehusageType = vehusageType;
	}

	public String getMilesday() {
		return milesday;
	}

	public void setMilesday(String milesday) {
		this.milesday = milesday;
	}

	public String getLiabilitycoverage() {
		return liabilitycoverage;
	}

	public void setLiabilitycoverage(String liabilitycoverage) {
		this.liabilitycoverage = liabilitycoverage;
	}
	
public String quotedPrem() {
	String lia = getLiabilitycoverage();
	String veh = getVehusageType();
	String cov = getCoveragetype();
	int quotedPrem;
	lia=lia.trim();
	int lia1 = Integer.parseInt(lia);
	if (veh.equalsIgnoreCase("Personal") && cov.equalsIgnoreCase("Liability"))
	{
          quotedPrem = (2*lia1) / (1000);
	} 
	else if (veh.equalsIgnoreCase("Personal") && cov.equalsIgnoreCase("Collision"))
	{
    
     quotedPrem = (3*lia1) / (1000);

	}
     else if ((veh.equalsIgnoreCase("Personal") && cov.equalsIgnoreCase("Comprehensive")) || (veh.equalsIgnoreCase("Commercial") && cov.equalsIgnoreCase("Liability")))
	{
     
     quotedPrem = (4*lia1) / (1000);
   
     }
     else if (veh.equalsIgnoreCase("Commercial") && cov.equalsIgnoreCase("Collision"))
	{
     
     quotedPrem = (5*lia1) / (1000);
     
     }
	
	else
	{
         quotedPrem = (6*lia1) / (1000);
         
	}
	return String.valueOf(quotedPrem);
	
	}
    	
 public String getQuotedPremium() {
		return quotedPrem();
	}	
}
	
