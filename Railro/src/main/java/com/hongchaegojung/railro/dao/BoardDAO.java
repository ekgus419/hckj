package com.hongchaegojung.railro.dao;

import java.util.List;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.BoardFile;

public interface BoardDAO {

	// 글 전체 개수
	public int getTotalBoardListCount();
	
	// 글 검색
	public List<Board> searchBoardList(String keyField, String keyWord);
	
	// 글 검색결과 개수
	public int countSearchBoardList(String keyField, String keyWord);
	
	// 글 목록 
	public List<Board> getBoardList();
	
	// 글 상세보기 
	public Board getDetail(int ID);
	
	// 글 등록 
	public boolean insert(Board board);
	public int lastKey();
	public void insertFile(BoardFile boardFile);
	
	// 글 수정 
	public void update(Board board);
	
	// 글 삭제 
	public void delete(int ID);
	
	// 글 답변 등록
	public int replyInsert(Board board);
	
	// 조회수 업데이트 
	public void setHitUpdate(int ID);
	
	// 글쓴이인지 확인 
	public boolean isBoardWriter(int ID, String WRITER);
	
}
