package com.hongchaegojung.railro.dto;

import java.sql.Date;

public class Member { // 13°³
	
	private int IDX;
	private String ID;
	private String PWD;
	private String NAME;
	private int AGE;
	private int GENDER;
	private String INTEREST;
	private String PHONE;
	private String EMAIL;
	private String ADDRESS;
	private String ZIPCODE;
	private String PROFILEURL;
	private Date JOINDATE;
	private int CONFIRMFLAG;
	
	public int getIDX() {
		return IDX;
	}
	public void setIDX(int iDX) {
		IDX = iDX;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public int getGENDER() {
		return GENDER;
	}
	public void setGENDER(int gENDER) {
		GENDER = gENDER;
	}
	public String getINTEREST() {
		return INTEREST;
	}
	public void setINTEREST(String iNTEREST) {
		INTEREST = iNTEREST;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	public String getPROFILEURL() {
		return PROFILEURL;
	}
	public void setPROFILEURL(String pROFILEURL) {
		PROFILEURL = pROFILEURL;
	}
	public Date getJOINDATE() {
		return JOINDATE;
	}
	public void setJOINDATE(Date jOINDATE) {
		JOINDATE = jOINDATE;
	}
	public int getCONFIRMFLAG() {
		return CONFIRMFLAG;
	}
	public void setCONFIRMFLAG(int cONFIRMFLAG) {
		CONFIRMFLAG = cONFIRMFLAG;
	}
	@Override
	public String toString() {
		return "Member [IDX=" + IDX + ", ID=" + ID + ", PWD=" + PWD + ", NAME=" + NAME + ", AGE=" + AGE + ", GENDER="
				+ GENDER + ", INTEREST=" + INTEREST + ", PHONE=" + PHONE + ", EMAIL=" + EMAIL + ", ADDRESS=" + ADDRESS
				+ ", ZIPCODE=" + ZIPCODE + ", PROFILEURL=" + PROFILEURL + ", JOINDATE=" + JOINDATE + ", CONFIRMFLAG="
				+ CONFIRMFLAG + "]";
	}
	
	
	
	
	
	
	
}
