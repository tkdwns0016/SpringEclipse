package com.myapp.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private int id;
	private String userId;
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd") //String 형식이 넘어왔을때 패턴대로 변환해서 넣어줌.
	private LocalDate birthDate;
	private String phone;
	private String address;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime joinedDate;
	public User(int id, String userId, String password, LocalDate birthDate, String phone, String address,
			LocalDateTime joinedDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.birthDate = birthDate;
		this.phone = phone;
		this.address = address;
		this.joinedDate = joinedDate;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDateTime getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(LocalDateTime joinedDate) {
		this.joinedDate = joinedDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", birthDate=" + birthDate
				+ ", phone=" + phone + ", address=" + address + ", joinedDate=" + joinedDate + "]";
	}
	
	
}
