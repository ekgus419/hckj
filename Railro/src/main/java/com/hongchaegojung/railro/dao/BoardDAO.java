package com.hongchaegojung.railro.dao;

import java.util.List;
import com.hongchaegojung.railro.dto.Board;

public interface BoardDAO {
	
	// �� ��ü ����
	public int getTotalBoardListCount();
	
	// �� �˻�
	public List<Board> searchBoardList();
	
	// �� �˻���� ����
	public int countSearchBoardList();
	
	// �� ��� 
	public List<Board> getBoardList();
	
	// �� �󼼺��� 
	public Board getDetail(int ID);
	
	// �� ��� 
	public void insert(Board board);
	
	// �� ���� 
	public boolean update(Board board);
	
	// �� ���� 
	public boolean delete(int ID);
	
	// �� �亯 ���
	public int replyInsert(Board board);
	
	// ��ȸ�� ������Ʈ 
	public void setHitUpdate(int ID);
	
	// �۾������� Ȯ�� 
	public boolean isBoardWriter(int ID, String WRITER);
	
}
