package autoquote;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


public class Vehicle {
	
	@NotEmpty(message = "Please enter your Vehicle Number.")
	String vehnum;

	@NotEmpty(message = "Please enter model year.")
	String modelyear;
	
	@NotEmpty(message = "Please enter make.")
	String make;
	
	@NotEmpty(message = "Please enter model.")
	String model;
	
	@NotEmpty(message = "Please enter VIN number.")
	@Size(min=17, max=17, message = "VIN number should be 17 digits")
	String vinnumber;
	
	public String getVehnum() {
		return vehnum;
	}

	public void setVehnum(String vehnum) {
		this.vehnum = vehnum;
	}

	public String getModelyear() {
		return modelyear;
	}

	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVinnumber() {
		return vinnumber;
	}

	public void setVinnumber(String vinnumber) {
		this.vinnumber = vinnumber;
	}
		
}