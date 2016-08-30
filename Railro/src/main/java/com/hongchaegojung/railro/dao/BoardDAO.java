package com.hongchaegojung.railro.dao;

import java.util.List;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.BoardFile;

public interface BoardDAO {

	// �� ��ü ����
	public int getTotalBoardListCount();
	
	// �� �˻�
<<<<<<< HEAD
	public List<Board> searchBoardList(String keyField, String keyWord);
=======
<<<<<<< HEAD
	public List<Board> searchBoardList(String keyField, String keyWord);
=======
<<<<<<< HEAD
	public List<Board> searchBoardList(String keyField, String keyWord);
=======
	public List<Board> searchBoardList(String keyFiled,String keyWord);
>>>>>>> 7f3748870af8f1255e117ab697b703ed8f33a298
>>>>>>> 051899efdddad143c1ae0bdd2fa0cdd63b7a32f2
>>>>>>> 8380d7d9e737573b6a9409e843ede64bb62c0fbf
	
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
