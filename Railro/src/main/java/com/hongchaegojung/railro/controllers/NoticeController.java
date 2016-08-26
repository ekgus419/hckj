package com.hongchaegojung.railro.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongchaegojung.railro.dao.NoticeDAO;
import com.hongchaegojung.railro.dto.Notice;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="/noticeList.htm", method=RequestMethod.GET)
	public String noticeList(Model model) {
		NoticeDAO noticeDAO = sqlSession.getMapper(NoticeDAO.class);
		
		int listCount = noticeDAO.getTotalNoticeListCount();
		List<Notice> list = noticeDAO.getNoticeList();
		
		model.addAttribute("listCount", listCount);
		model.addAttribute("noticeList", list);
		return "notice.noticeList";
	}
	
	@RequestMapping(value="/noticeDetail.htm", method=RequestMethod.GET)
	public String test2() {
		return "notice.noticeDetail";
	}

	@RequestMapping(value="/noticeReg.htm", method=RequestMethod.GET)
	public String test3() {
		return "notice.noticeReg";
	}

	@RequestMapping(value="/noticeReg.htm", method=RequestMethod.POST)
	public String test31(@ModelAttribute Notice notice) {
		NoticeDAO noticeDAO = sqlSession.getMapper(NoticeDAO.class);
		noticeDAO.insert(notice);
		return "redirect:noticeList.htm";
	}
	
	@RequestMapping(value="/noticeEdit.htm", method=RequestMethod.GET)
	public String test4() {
		return "notice.noticeEdit";
	}

	@RequestMapping(value="/noticeSearchList.htm", method=RequestMethod.GET)
	public String test5() {
		return "notice.noticeSearchList";
	}


}
