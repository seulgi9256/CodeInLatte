package cafe.dto;

import java.io.Serializable;

public class User implements Serializable { 
	 
	private static final long serialVersionUID = 1L;
	
	private String user_No;
	private String user_Id;
	private String user_Password;
	private String user_Name;
	private String user_Birth;
	private String user_Tel;
	private String user_Address;
	private String user_Regdate;
	private String user_Stamp;
	
	public User() {
		
	}
	
	public String getNo() {
		return user_No;
	}

	public void setNo(String user_No) {
		this.user_No = user_No;
	}

	public String getId() {
		return user_Id;
	}

	public void setId(String id) {
		this.user_Id = id;
	}

	public String getPassword() {
		return user_Password;
	}

	public void setPassword(String user_Password) {
		this.user_Password = user_Password;
	}

	public String getName() {
		return user_Name;
	}

	public void setName(String user_Name) {
		this.user_Name = user_Name;
	}


	public String getBirth() {
		return user_Birth;
	}

	public void setBirth(String user_Birth) {
		this.user_Birth = user_Birth;
	}


	public String getTel() {
		return user_Tel;
	}

	public void setTel(String user_Tel) {
		this.user_Tel = user_Tel;
	}

	public String getAddress() {
		return user_Address;
	}

	public void setAddress(String user_Address) {
		this.user_Address = user_Address;
	}

	public String getRegdate() {
		return user_Regdate;
	}

	public void setRegdate(String user_Regdate) {
		this.user_Regdate = user_Regdate;
	}

	public String getStamp() {
		return user_Stamp;
	}

	public void setStamp(String user_Stamp) {
		this.user_Stamp = user_Stamp;
	}

	@Override
	public String toString() {
		return "User [user_No=" + user_No + ", user_Id=" + user_Id + ", user_Password=" + user_Password + ", user_Name="
				+ user_Name + ", user_Birth=" + user_Birth + ", user_Tel=" + user_Tel + ", user_Address=" + user_Address
				+ ", user_Regdate=" + user_Regdate + ", user_Stamp=" + user_Stamp + "]";
	}


	
	

}
