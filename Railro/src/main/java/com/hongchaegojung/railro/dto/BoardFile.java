package com.hongchaegojung.railro.dto;

public class BoardFile { // 6°³

	private int ID;
	private int BOARDID;
	private String ORIGINFILENAME;
	private String STOREDFILENAME;
	private int FILESIZE;
	private int DELFLAG;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getBOARDID() {
		return BOARDID;
	}
	public void setBOARDID(int bOARDID) {
		BOARDID = bOARDID;
	}
	public String getORIGINFILENAME() {
		return ORIGINFILENAME;
	}
	public void setORIGINFILENAME(String oRIGINFILENAME) {
		ORIGINFILENAME = oRIGINFILENAME;
	}
	public String getSTOREDFILENAME() {
		return STOREDFILENAME;
	}
	public void setSTOREDFILENAME(String sTOREDFILENAME) {
		STOREDFILENAME = sTOREDFILENAME;
	}
	public int getFILESIZE() {
		return FILESIZE;
	}
	public void setFILESIZE(int fILESIZE) {
		FILESIZE = fILESIZE;
	}
	public int getDELFLAG() {
		return DELFLAG;
	}
	public void setDELFLAG(int dELFLAG) {
		DELFLAG = dELFLAG;
	}
	@Override
	public String toString() {
		return "BoardFile [ID=" + ID + ", BOARDID=" + BOARDID + ", ORIGINFILENAME=" + ORIGINFILENAME
				+ ", STOREDFILENAME=" + STOREDFILENAME + ", FILESIZE=" + FILESIZE + ", DELFLAG=" + DELFLAG + "]";
	}
	
	
	
}
