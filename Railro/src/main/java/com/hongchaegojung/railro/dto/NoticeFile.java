package com.hongchaegojung.railro.dto;

public class NoticeFile { //6°³

	private int ID;
	private int NOTICEID;
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
	public int getNOTICEID() {
		return NOTICEID;
	}
	public void setNOTICEID(int nOTICEID) {
		NOTICEID = nOTICEID;
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
		return "NoticeFile [ID=" + ID + ", NOTICEID=" + NOTICEID + ", ORIGINFILENAME=" + ORIGINFILENAME
				+ ", STOREDFILENAME=" + STOREDFILENAME + ", FILESIZE=" + FILESIZE + ", DELFLAG=" + DELFLAG + "]";
	}
	
	
	
	
}
