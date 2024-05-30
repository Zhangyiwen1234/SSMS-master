package model;

public class User {
	private int userID;
	private String userNum;
	private String userName;
	private String password;
	private String phone;
	private int roleID;
	private String roleName;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User(int userID, String userNum, String userName, String password,
			String phone, String roleName) {
		super();
		this.userID = userID;
		this.userNum = userNum;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.roleName = roleName;
	}
	public User() {
		super();
		
	}
/*
	public User(String userNum, String userName, String password, String phone,
			int roleID) {
		super();
		this.userNum = userNum;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.roleID = roleID;
	}
*/

	public User(String userNum, String userName, String password,
				  String phone, String roleName) {
		super();

		this.userNum = userNum;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.roleName = roleName;

	}
	public User(String userNum, String password, String roleName) {
		super();
		this.userNum = userNum;
		this.password = password;
		this.roleName = roleName;
	}
	
	
}
