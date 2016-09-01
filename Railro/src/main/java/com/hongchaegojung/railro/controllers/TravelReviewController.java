package com.hongchaegojung.railro.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongchaegojung.railro.dao.BoardDAO;
import com.hongchaegojung.railro.dao.TravelReviewDAO;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.Paging;

@Controller
@RequestMapping("/travelReview")
public class TravelReviewController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="/travelReviewList.htm", method=RequestMethod.GET)
	public String travelReviewList(Paging paging, String pageNo, String keyField, String keyWord, String limit, Model model) {
		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		int listCount = travelReDAO.getTotalBoardListCount(keyField, keyWord);

		if(limit != null){
			paging.setPageSize(Integer.parseInt(limit)); // 한 페이지에 보일 게시글 수 
		}else{
			paging.setPageSize(10); // 기본값
		}
		
		paging.setPageNo(1); // 현재 페이지 번호
		paging.setBlockSize(10);
		paging.setTotalCount(listCount); // 게시물 총 개수
		
		if(pageNo != null){
			paging.setPageNo(Integer.parseInt(pageNo));
		}

		List<Board> list = travelReDAO.getBoardList(paging, keyField, keyWord);
		
		model.addAttribute("paging", paging);
		model.addAttribute("listCount", listCount);
		model.addAttribute("travelReviewList", list);
		
		return "travelReview.travelReviewList";
	}
	
	@RequestMapping(value="/travelReviewReg.htm", method=RequestMethod.GET)
	public String travelReviewReg() {
		return "travelReview.travelReviewReg";
	}
	
	@RequestMapping(value="/travelReviewReg.htm", method=RequestMethod.POST)
	public String travelReviewReg(Board board) {
		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		travelReDAO.insert(board);
		return "redirect:travelReviewList.htm";
	}
	
	
	@Transactional(isolation=Isolation.READ_UNCOMMITTED)
	@RequestMapping(value="/travelReviewDetail.htm", method=RequestMethod.GET)
	public String travelReviewDetail(final int ID, Model model) {
		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		travelReDAO.setHitUpdate(ID);
		Board board = travelReDAO.getDetail(ID);
		model.addAttribute("board", board);
		
		return "travelReview.travelReviewDetail";
	}

	@RequestMapping(value="/travelReviewEdit.htm", method=RequestMethod.GET)
	public String travelReviewEdit(final int ID, Model model) {
		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		Board board = travelReDAO.getDetail(ID);
	
		model.addAttribute("board", board);
		return "travelReview.travelReviewEdit";
	}
	
	@RequestMapping(value="/travelReviewEdit.htm", method=RequestMethod.POST)
	public String travelReviewEdit(Board board) {
		
		TravelReviewDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		travelReDAO.update(board);
		
		return "redirect:travelReviewDetail.htm?ID="+board.getID();
	}
	
	@RequestMapping(value="/travelReviewDel.htm")
	public String travelReviewDel(int ID) {
		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
		travelReDAO.delete(ID);
		return "redirect:travelReviewList.htm";
	}
	
	
	
	/*
	@RequestMapping(value="/travelReviewSearchList.htm")
	public String trvelReviewSearchList(String keyField, String keyWord, Model model) {
//		BoardDAO travelReDAO = sqlSession.getMapper(TravelReviewDAO.class);
//		List<Board> list = travelReDAO.searchBoardList(keyField, keyWord);
//		int listCount = travelReDAO.countSearchBoardList(keyField, keyWord);
//		
//		model.addAttribute("sList", list);
//		model.addAttribute("listCount", listCount);
		return "travelReview.travelReviewSearchList";
	}*/
	

	


	/* 
	
	// 삭제, 다운로드
		@RequestMapping("download.htm")
	public void download(String p,  String f, HttpServletRequest request, HttpServletResponse response) throws IOException{
		String fname = new String(f.getBytes("ISO8859_1"), "UTF-8");
		response.setHeader("Content-Disposition", "attachement;filename="+new String(fname.getBytes(), "ISO8859_1"));
		
		String fullPath = request.getServletContext().getRealPath(p+ "/" +fname);
		FileInputStream fin = new FileInputStream(fullPath);
		ServletOutputStream sout = response.getOutputStream();
		
		byte[] buf = new byte[1024];
		int size = 0;
		
		while((size=fin.read(buf, 0, 1024))!=-1){
			sout.write(buf, 0, size);
		}
		fin.close();
		sout.close();
	}*/
	
	

	
}
