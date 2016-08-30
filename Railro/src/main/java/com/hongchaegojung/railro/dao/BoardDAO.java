package com.hongchaegojung.railro.dao;

import java.util.List;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.BoardFile;

public interface BoardDAO {

	// �� ��ü ����
	public int getTotalBoardListCount();
	
	// �� �˻�
	public List<Board> searchBoardList(String keyField, String keyWord);
	
	// �� �˻���� ����
	public int countSearchBoardList(String keyField, String keyWord);
	
	// �� ��� 
	public List<Board> getBoardList();
	
	// �� �󼼺��� 
	public Board getDetail(int ID);
	
	// �� ��� 
	public boolean insert(Board board);
	public int lastKey();
	public void insertFile(BoardFile boardFile);
	
	// �� ���� 
	public void update(Board board);
	
	// �� ���� 
	public void delete(int ID);
	
	// �� �亯 ���
	public int replyInsert(Board board);
	
	// ��ȸ�� ������Ʈ 
	public void setHitUpdate(int ID);
	
	// �۾������� Ȯ�� 
	public boolean isBoardWriter(int ID, String WRITER);
	
}
