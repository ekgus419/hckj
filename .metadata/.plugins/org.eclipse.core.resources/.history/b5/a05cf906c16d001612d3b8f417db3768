package com.hongchaegojung.railro.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongchaegojung.railro.dao.BoardDAO;
import com.hongchaegojung.railro.dao.FreeBoardDAO;
import com.hongchaegojung.railro.dto.Board;

@Controller
@RequestMapping("/freeBoard")
public class FreeBoardController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value={"/freeBoardList.htm"}, method=RequestMethod.GET)
	public String freeBoardList(Model model) {
		BoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		int listCount = freeDAO.getTotalBoardListCount();

		List<Board> list = freeDAO.getBoardList();
		
		
		model.addAttribute("listCount", listCount);
		model.addAttribute("freeBoardList", list);
		
		return "freeBoard.freeBoardList";
	}	
	
	@RequestMapping(value="/freeBoardDetail.htm",method=RequestMethod.GET)
	public String freeBoardDetail(final int ID, Model model) {
		
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		Board board = freeDAO.getDetail(ID);
		model.addAttribute("board", board);
		
		return "freeBoard.freeBoardDetail";
	}
	
	@RequestMapping(value="/freeBoardEdit.htm",method=RequestMethod.GET)
	public String freeBoardEdit(final int ID, Model model) {
		
		BoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		Board board = freeDAO.getDetail(ID);
		model.addAttribute("board", board);
		
		return "freeBoard.freeBoardEdit";
	}
	
	@RequestMapping(value="/freeBoardEdit.htm",method=RequestMethod.POST)
	public String freeBoardEdit(Board board) {
		
		FreeBoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		freeDAO.update(board);
		
		return "redirect:freeBoardDetail.htm?ID="+board.getID();
	}
	@RequestMapping(value="/freeBoardDel.htm")
	public String freeBoardDel(int ID) {
		BoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		freeDAO.delete(ID);
		return "redirect:freeBoardList.htm";
	}
/*	
	
	
	
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
	
	@RequestMapping(value="/freeBoardReg.htm", method=RequestMethod.GET)
	public String freeBoardReg() {
		return "freeBoard.freeBoardReg";
	}
	
	@RequestMapping(value="/freeBoardReg.htm", method=RequestMethod.POST)
	public String freeBoardReg(Board board) {
		BoardDAO freeDAO = sqlSession.getMapper(FreeBoardDAO.class);
		freeDAO.insert(board);	
		return "redirect:freeBoardList.htm";
	}
}
