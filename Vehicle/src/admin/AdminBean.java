package admin;

public class AdminBean {
	private int employeeid;
	private String Name;
	private String emailaddress;
	private long mobilenumber;
	//getter and setter methods
	public int getEmployeeId() {
		return employeeid;
	}
	public void setEmployeeId(int employee_Id) {
		this.employeeid = employee_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getEmailAddress() {
		return emailaddress;
	}
	public void setEmailAddress(String email_Address) {
		this.emailaddress = email_Address;
	}
	public long getMobileNumber() {
		return mobilenumber;
	}
	public void setMobileNumber(long mobile_Number) {
		this.mobilenumber = mobile_Number;
	}

}
