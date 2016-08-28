package com.hongchaegojung.railro.dto;

public class Bookmark {

	private int ID;
	private int MID;
	private int BID;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMID() {
		return MID;
	}
	public void setMID(int mID) {
		MID = mID;
	}
	public int getBID() {
		return BID;
	}
	public void setBID(int bID) {
		BID = bID;
	}
	@Override
	public String toString() {
		return "Bookmark [ID=" + ID + ", MID=" + MID + ", BID=" + BID + "]";
	}
	
	
	
}
