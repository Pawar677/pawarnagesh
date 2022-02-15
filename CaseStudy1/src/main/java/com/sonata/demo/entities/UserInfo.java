package com.sonata.demo.entities;

public class UserInfo {

	private int Userid;
	private String Username;
	private String UserTask;
	
	public UserInfo(int userid, String username, String userTask) {
		super();
		Userid = userid;
		Username = username;
		UserTask = userTask;
	}
	
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserTask() {
		return UserTask;
	}
	public void setUserTask(String userTask) {
		UserTask = userTask;
	}
	
	@Override
	public String toString() {
		return "UserInfo [Userid=" + Userid + ", Username=" + Username + ", UserTask=" + UserTask + "]";
	}
	
}
