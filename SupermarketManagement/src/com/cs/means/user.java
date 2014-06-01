package com.cs.means;

public class user {
	
	//类的成员变量
	/*user表中的各个字段*/
	private int CardID;
	private String userName;
	private String IDcard;
	private String Password;
	private String CardDate;
	private String UserGrade;
	private String term;
	private String integral;
	private String agio;
	private String remark;
	public user() {
		// TODO Auto-generated constructor stub
	}
	public int getCardID() {
		return CardID;
	}
	public void setCardiD(int cardID) {
		CardID = cardID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCardDate() {
		return CardDate;
	}
	public void setCardDate(String cardDate) {
		CardDate = cardDate;
	}
	public String getUserGrade() {
		return UserGrade;
	}
	public void setUserGrade(String userGrade) {
		UserGrade = userGrade;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getIntegral() {
		return integral;
	}
	public void setIntegral(String integral) {
		this.integral = integral;
	}
	public String getAgio() {
		return agio;
	}
	public void setAgio(String agio) {
		this.agio = agio;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
