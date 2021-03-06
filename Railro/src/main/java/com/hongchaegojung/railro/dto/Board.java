package com.hongchaegojung.railro.dto;

import java.sql.Date;

public class Board { //12��

	private int ID;
	private int TYPE;
	private String SUBJECT;
	private String TITLE;
	private String CONTENTS;
	private String WRITER;
	private String REFLOCATION;
	private int REREF;
	private int RELEV;
	private int RESEQ;
	private Date REGDATE;
	private int HIT;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTYPE() {
		return TYPE;
	}
	public void setTYPE(int tYPE) {
		TYPE = tYPE;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENTS() {
		return CONTENTS;
	}
	public void setCONTENTS(String cONTENTS) {
		CONTENTS = cONTENTS;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String wRITER) {
		WRITER = wRITER;
	}
	public String getREFLOCATION() {
		return REFLOCATION;
	}
	public void setREFLOCATION(String rEFLOCATION) {
		REFLOCATION = rEFLOCATION;
	}
	public int getREREF() {
		return REREF;
	}
	public void setREREF(int rEREF) {
		REREF = rEREF;
	}
	public int getRELEV() {
		return RELEV;
	}
	public void setRELEV(int rELEV) {
		RELEV = rELEV;
	}
	public int getRESEQ() {
		return RESEQ;
	}
	public void setRESEQ(int rESEQ) {
		RESEQ = rESEQ;
	}
	public Date getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(Date rEGDATE) {
		REGDATE = rEGDATE;
	}
	public int getHIT() {
		return HIT;
	}
	public void setHIT(int hIT) {
		HIT = hIT;
	}
	@Override
	public String toString() {
		return "Board [ID=" + ID + ", TYPE=" + TYPE + ", SUBJECT=" + SUBJECT + ", TITLE=" + TITLE + ", CONTENTS="
				+ CONTENTS + ", WRITER=" + WRITER + ", REFLOCATION=" + REFLOCATION + ", REREF=" + REREF + ", RELEV="
				+ RELEV + ", RESEQ=" + RESEQ + ", REGDATE=" + REGDATE + ", HIT=" + HIT + "]";
	}
}
