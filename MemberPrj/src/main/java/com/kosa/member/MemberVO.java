package com.kosa.member;

public class MemberVO {
	private String memberID;
	private String name;
	private int  age;
	private String email;
	
	

	public String getMemberID() {
		return memberID;
	}



	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberVO [memberID=" + memberID + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
}
