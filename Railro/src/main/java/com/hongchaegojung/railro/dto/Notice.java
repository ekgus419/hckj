package com.hongchaegojung.railro.dto;

import java.sql.Date;

public class Notice { //6��

	private int ID;
	private String TITLE;
	private String CONTENTS;
	private String WRITER;
	private Date REGDATE;
	private int HIT;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
		return "Notice [ID=" + ID + ", TITLE=" + TITLE + ", CONTENTS=" + CONTENTS + ", WRITER=" + WRITER + ", REGDATE="
				+ REGDATE + ", HIT=" + HIT + "]";
	}
	
	
	
	
	
}
