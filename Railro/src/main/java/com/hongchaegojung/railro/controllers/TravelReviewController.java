package com.hongchaegojung.railro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/travelReview/*")
public class TravelReviewController {
	@RequestMapping(value={"travelReviewList.htm"}, method=RequestMethod.GET)
	public String test1() {
		return "travelReview.travelReviewList";
	}
	
	@RequestMapping(value={"travelReviewDetail.htm"}, method=RequestMethod.GET)
	public String test2() {
		return "travelReview.travelReviewDetail";
	}

	@RequestMapping(value={"travelReviewReg.htm"}, method=RequestMethod.GET)
	public String test3() {
		return "travelReview.travelReviewReg";
	}

	@RequestMapping(value={"travelReviewEdit.htm"}, method=RequestMethod.GET)
	public String test4() {
		return "travelReview.travelReviewEdit";
	}

	@RequestMapping(value={"travelReviewSearchList.htm"}, method=RequestMethod.GET)
	public String test5() {
		return "travelReview.travelReviewSearchList";
	}
}
