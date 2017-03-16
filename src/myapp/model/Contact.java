package myapp.model;

public class Contact {

	String empID, empName, mobileNo, officeNo, homeNo,email ;
		public Contact()
		{
			
		}
	/**
	 * @param empID
	 * @param empName
	 * @param mobileNo
	 * @param officeNo
	 * @param homeNo
	 * @param email
	 */
	public Contact(String empID, String empName, String mobileNo, String officeNo, String homeNo, String email) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.officeNo = officeNo;
		this.homeNo = homeNo;
		this.email = email;
	}

	/**
	 * @return the empID
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the officeNo
	 */
	public String getOfficeNo() {
		return officeNo;
	}

	/**
	 * @param officeNo the officeNo to set
	 */
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	/**
	 * @return the homeNo
	 */
	public String getHomeNo() {
		return homeNo;
	}

	/**
	 * @param homeNo the homeNo to set
	 */
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}

