package com.example.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String birthday;
	private String gender;
	private String email;
	private String recvEmail;
	private Date regDate;
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getPasswd() {
//		return passwd;
//	}
//	public void setPasswd(String passwd) {
//		this.passwd = passwd;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getBirthday() {
//		return birthday;
//	}
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getRecvEmail() {
//		return recvEmail;
//	}
//	public void setRecvEmail(String recvEmail) {
//		this.recvEmail = recvEmail;
//	}
//	public Date getRegDate() {
//		return regDate;
//	}
//	public void setRegDate(Date regDate) {
//		this.regDate = regDate;
//	}
//	@Override
//	public String toString() {
//		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", birthday=" + birthday + ", gender="
//				+ gender + ", email=" + email + ", recvEmail=" + recvEmail + ", regDate=" + regDate + "]";
//	}
//	
	
}
