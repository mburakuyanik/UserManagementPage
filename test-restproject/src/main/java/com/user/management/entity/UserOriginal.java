//package com.user.management.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "TBL_USER")
//public class UserOriginal implements Serializable {
//
//	private static final long serialVersionUID = 2654425653358523958L;
//
//	@Column
//	@Id
//	@SequenceGenerator(name = "TABLE_ID_GENERATOR", sequenceName = "HIBERNATE_SEQUENCE_GENERATOR")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TABLE_ID_GENERATOR")
//	private long id;
//
//	@Column
//	private String username;
//
//	@Column
//	private String email;
//
//	@Column
//	private String password;
//
//	@Column
//	private int status;
//	
//	//@Column
//	//private int wrongLoginCount;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}
//	
////	public int getWrongLoginCount() {
////		return wrongLoginCount;
////	}
////	
////	public void setWrongLoginCount() {
////		this.wrongLoginCount = wrongLoginCount;
////	}
//}
