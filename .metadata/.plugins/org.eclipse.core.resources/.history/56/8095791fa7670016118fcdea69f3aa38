package com.hongchaegojung.railro.dao;

import java.util.List;
import java.util.Vector;

import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.Member;

public interface MemberDAO {

	// 로그인 
	public int login(Member member);
	
	// 회원가입
	public boolean join(Member member);
	
	// 회원 수 
	public int countMember(Member member);
	
	// 회원목록(조회) 
	public List<Member member> memberList();
	
	// 회원정보보기 
	public Member getMember(String memberId);
	
	// 회원정보수정 
	public int(boolean) modifyMember(Member member);
	
	// 회원탈퇴 
	public boolean deleteMember(String memberId);
	
	// 글 담기
	public void addBookmark(Board board);
	
	// 글 담기 목록 가져오기
	public Vector getBookmark(Board board);
	
	// 글 담기 삭제
	public boolean bookRemove(int bdnum);
	
	// 내가 쓴 글 목록 
	public List<Board> getMyBoardList(String writer/*(또는 memberId))*/;
	
	// 내가 쓴 글 목록 수 
	public int countMyBoardList(String writer/*(또는 memberId))*/;
	
	// 출석수(내가 접속한 수) 
	public int myConnectionCount(int dayCount);
	
	
}
