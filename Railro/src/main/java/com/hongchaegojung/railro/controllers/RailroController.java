package com.hongchaegojung.railro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/railro/*")
public class RailroController {
	@RequestMapping(value={"railroList.htm"}, method=RequestMethod.GET)
	public String test1() {
		return "railro.railroList";
	}
	
	@RequestMapping(value={"railroDetail.htm"}, method=RequestMethod.GET)
	public String test2() {
		return "railro.railroDetail";
	}
	
	@RequestMapping(value={"railroEdit.htm"}, method=RequestMethod.GET)
	public String test3() {
		return "railro.railroEdit";
	}
	
	@RequestMapping(value={"railroReg.htm"}, method=RequestMethod.GET)
	public String test4() {
		return "railro.railroReg";
	}
	
	@RequestMapping(value={"railroSearchList.htm"}, method=RequestMethod.GET)
	public String test5() {
		return "railro.railroSearchList";
	}
	
	
}
