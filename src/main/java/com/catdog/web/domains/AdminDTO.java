package com.catdog.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;


@Component
public class AdminDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String aid, pwd, ssn, creditCard, pName, phone, address, eMail;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "AdminDTO [aid=" + aid + ", pwd=" + pwd + ", ssn=" + ssn + ", creditCard=" + creditCard + ", pName="
				+ pName + ", phone=" + phone + ", address=" + address + ", eMail=" + eMail + "]";
	}
	
}
