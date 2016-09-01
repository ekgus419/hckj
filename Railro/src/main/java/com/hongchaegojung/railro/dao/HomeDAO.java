package com.hongchaegojung.railro.dao;

import java.util.List;

import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.Notice;

public interface HomeDAO {
	
	// �������� ���(Notice ���̺�)
	public List<Notice> getNoticeList();
	
	// �ֱٰԽù� ���(Board ���̺�)
	public List<Board> getBoardList(); 

}
