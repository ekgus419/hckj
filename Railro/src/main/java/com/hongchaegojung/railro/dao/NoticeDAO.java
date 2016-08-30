package com.hongchaegojung.railro.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.hongchaegojung.railro.dto.Notice;

public interface NoticeDAO {
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
	public void update(Notice notice);
	
	// �� ���� 
	public void delete(int ID);
	
	// �� �亯 ���
	public int replyInsert(Notice notice);
	
	// ��ȸ�� ������Ʈ 
	public void setHitUpdate(int ID);
}
