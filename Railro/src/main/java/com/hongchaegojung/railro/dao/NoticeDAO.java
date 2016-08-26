package com.hongchaegojung.railro.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.hongchaegojung.railro.dto.Notice;
import com.hongchaegojung.railro.dto.NoticeFile;

public interface NoticeDAO {
<<<<<<< HEAD
	// �� ��ü ����
	public int getTotalNoticeListCount();
	
	// �� �˻�
	public List<Notice> searchNoticeList();
	
	// �� �˻���� ����
	public int countSearchNoticeList();
	
	// �� ��� 
	public List<Notice> getNoticeList(/*int page, int limit*/);
	
	// �� �󼼺��� 
	public Notice getDetail(int ID);
	
	// �� ��� 
	public void insert(Notice notice);
	
	// �� ���� 
	public boolean modify(int ID);
	
	// �� ���� 
	public boolean delete(int ID);
	
	// �� �亯 ���
	public int replyInsert(Notice notice);
	
	// ��ȸ�� ������Ʈ 
	public void setHitUpdate(int ID);
=======

		// �� ��ü ����
		public int getTotalBoardListCount();
		
		// �� �˻�
		public List<Notice> searchBoardList();
		
		// �� �˻���� ����
		public int countSearchBoardList();
		
		// �� ��� 
		public List<Notice> getBoardList(int page, int limit);
		
		// �� �󼼺��� 
		public Notice getDetail(int ID);
		
		// �� ��� 
		public void insert(Notice notice);
		public int lastKey();
		public void insertFile(NoticeFile noticeFile);
		// �� ���� 
		public boolean modify(int ID);
		
		// �� ���� 
		public boolean delete(int ID);
		
		// �� �亯 ���
		public int replyInsert(Notice notice);
		
		// ��ȸ�� ������Ʈ 
		public void setHitUpdate(int ID);
		
		// �۾������� Ȯ�� 
		public boolean isBoardWriter(int ID, String WRITER);
	
	/*public String getNoticeFileSrc(int ID){
		return null;
		// ���� ���� ���ε��ϴ� ������ �Խñ��� ��ȣ(noticeID)�� NoticeFile�� noticeID���� �Ѱ��༭
		// original FIlename�� �������� �޼���
	}*/
	
>>>>>>> 8521074db796575873dd59a426f406561b1b8fbc
}
