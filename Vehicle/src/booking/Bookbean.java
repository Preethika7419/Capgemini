package booking;

import java.io.Serializable;

public class Bookbean {
	private int vehicleid;
	private String name;
	  private String email;
	  private long  phne;
	  private String address;
	  
	 
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	 public int getVehicleid() {
			return vehicleid;
		}
	 
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setPhne(long phne) {
		this.phne = phne;
	}
	public long getPhne() {
		return phne;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	  
	
	

}
