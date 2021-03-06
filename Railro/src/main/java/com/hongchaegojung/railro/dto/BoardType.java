package com.hongchaegojung.railro.dto;

public enum BoardType {
	
	freeBoard(1), railro(2), travelReview(3);
	
	private final int value;

	private BoardType(int value) {
		this.value = value;
	}
	
	public int intValue(){
		return value;	
	}
	
	public static BoardType valueOf(int value){	
		switch(value){ 	
			case 1: return freeBoard;
		 	case 2: return railro;
		 	case 3: return travelReview;
		 	default: throw new 	AssertionError("Unknown value" + value);	
		}	
	}		
}
