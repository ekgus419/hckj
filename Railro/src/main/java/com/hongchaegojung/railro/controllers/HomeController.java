package com.hongchaegojung.railro.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongchaegojung.railro.dao.HomeDAO;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.Notice;

@Controller
@RequestMapping("/*")
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value={"index.htm"})
	public String home(Model model) {
		HomeDAO homeDAO = sqlSession.getMapper(HomeDAO.class);
		
		List<Notice> noticeList = homeDAO.getNoticeList();
		List<Board> boardList = homeDAO.getBoardList();
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("boardList", boardList);
		
		return "home.index";
	}	
}

