package com.hongchaegojung.railro.controllers;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongchaegojung.railro.dao.FreeBoardDAO;
import com.hongchaegojung.railro.dto.Board;

@Controller
@RequestMapping("/freeBoard/*")
public class FreeBoardController {
	
/*	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value={"freeBoardDetail.htm"},method=RequestMethod.GET)
	public String freeBoardDetail(final int ID, Model model) {
		
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		Board board = freeDAO.getDetail(ID);
		model.addAttribute("board", board);
		
		return "freeBoard.freeBoardDetail";
	}
	
	@RequestMapping(value={"freeBoardEdit.htm"},method=RequestMethod.GET)
	public String freeBoardEdit(int ID, Model model) {
		
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		Board board = freeDAO.getDetail(ID);
		model.addAttribute("board", board);
		
		return "freeBoard.freeBoardEdit";
	}
	
	
	@RequestMapping(value={"freeBoardEdit.htm"},method=RequestMethod.POST)
	public String freeBoardEdit(Board freeBoard) {
		
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		freeDAO.update(freeBoard);
		
		return  "redirect:freeBoardDetail.htm?ID="+freeBoard.getID(); 
	
	}
	
		@RequestMapping(value={"freeBoardList.htm"},method=RequestMethod.GET)
	public String test3() {
		return "freeBoard.freeBoardList";
	}
	
	
	
	@RequestMapping(value={"freeBoardInsert.htm"},method=RequestMethod.GET)
	public String freeBoardInsert() {
		return "freeBoard.freeBoardInsert";
	}
	
	@RequestMapping(value={"freeBoardSearchList.htm"},method=RequestMethod.GET)
	public String test5() {
		return "freeBoard.freeBoardSearchList";
	}
	
	
	// 삭제, 다운로드
	
	@RequestMapping("freeBoardDel.htm")
	public String freeBoardDel(int ID) {
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		freeDAO.delete(ID);
		return "redirect:notice.htm";
	}
	
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
	}
	
	
	*/
	
	
	
}
