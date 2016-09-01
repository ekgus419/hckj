package com.hongchaegojung.railro.dao;

import java.util.List;

import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.Notice;

public interface HomeDAO {
	
	// 공지사항 목록(Notice 테이블)
	public List<Notice> getNoticeList();
	
	// 최근게시물 목록(Board 테이블)
	public List<Board> getBoardList(); 

}
