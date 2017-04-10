package net.antra.sep.pojo;

public class User {
	private String userName;
	private Integer id;
	public User(String userName, Integer id) {
		this.userName = userName;
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
