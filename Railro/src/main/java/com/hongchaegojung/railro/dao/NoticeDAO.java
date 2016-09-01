package com.hongchaegojung.railro.dao;

import java.util.List;

import com.hongchaegojung.railro.dto.Notice;
import com.hongchaegojung.railro.dto.Paging;

public interface NoticeDAO {
	// �� ��ü ����
	public int getTotalNoticeListCount(String keyField, String keyWord);

	// �� ��� 
	public List<Notice> getNoticeList(Paging paging, String keyField, String keyWord);
	
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
