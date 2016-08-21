package com.hongchaegojung.railro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/freeBoard/*")
public class FreeBoardController {
	@RequestMapping(value={"freeBoardDetail.htm"},method=RequestMethod.GET)
	public String test1() {
		return "freeBoard.freeBoardDetail";
	}
	
	@RequestMapping(value={"freeBoardEdit.htm"},method=RequestMethod.GET)
	public String test2() {
		return "freeBoard.freeBoardEdit";
	}
	
	@RequestMapping(value={"freeBoardList.htm"},method=RequestMethod.GET)
	public String test3() {
		return "freeBoard.freeBoardList";
	}
	
	@RequestMapping(value={"freeBoardReg.htm"},method=RequestMethod.GET)
	public String test4() {
		return "freeBoard.freeBoardReg";
	}
	
	@RequestMapping(value={"freeBoardSearchList.htm"},method=RequestMethod.GET)
	public String test5() {
		return "freeBoard.freeBoardSearchList";
	}
}
