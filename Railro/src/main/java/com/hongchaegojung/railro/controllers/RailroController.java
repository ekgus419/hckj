/*package com.hongchaegojung.railro.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongchaegojung.railro.dao.BoardDAO;
import com.hongchaegojung.railro.dao.RailroDAO;
import com.hongchaegojung.railro.dto.Board;

@Controller
@RequestMapping("/railro")
public class RailroController {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 게시글 목록
	@RequestMapping(value="/railroList.htm", method=RequestMethod.GET)
	public String getBoardList(Model model) {
		BoardDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		int railroListCount = railroDAO.getTotalBoardListCount();
		List<Board> railroList = railroDAO.getBoardList();
		model.addAttribute("railroListCount", railroListCount);
		model.addAttribute("railroList", railroList);
		return "railro.railroList";
	} 
	
	// 게시글 등록 GET
	@RequestMapping(value="/railroReg.htm", method=RequestMethod.GET)
	public String railroReg() {
		return "railro.railroReg";
	}
	
	// 게시글 등록 POST
	@RequestMapping(value="/railroReg.htm", method=RequestMethod.POST)
	public String railroReg(Board board) {
		BoardDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		railroDAO.insert(board);
		return "redirect:railroList.htm";
	}
	
	// 게시글 상세보기
	@RequestMapping(value="/railroDetail.htm", method=RequestMethod.GET)
	public String railroDetail(final int ID, Model model) {
		
		RailroDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		Board board = railroDAO.getDetail(ID);
		
		model.addAttribute("board", board);
		
		return "railro.railroDetail";
		
	}
	
	// 게시글 수정 GET
	@RequestMapping(value="/railroEdit.htm", method=RequestMethod.GET)
	public String railroEdit(final int ID, Model model) {
		
		RailroDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		Board board = railroDAO.getDetail(ID);
		
		model.addAttribute("board", board);
		
		return "railro.railroEdit";
	}
	
	
	// 게시글 수정 POST
	@RequestMapping(value="/railroEdit.htm", method=RequestMethod.POST)
	public String railroEdit(Board board) {
		
		RailroDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		railroDAO.update(board);
		
		return "redirect:railroDetail.htm?ID=" + board.getID();
	}
	
	// 게시물 삭제
	@RequestMapping(value="/railroDel.htm")
	public String railroDel(int ID){
		
		BoardDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		
		railroDAO.delete(ID);
		return "redirect:railroList.htm";
		
	}
	
	// 게시물 검색
	@RequestMapping(value="/railroSearchList.htm")
	public String railroSearchList(String keyField, String keyWord, Model model){
		
		BoardDAO railroDAO = sqlSession.getMapper(RailroDAO.class);
		List<Board> board  = railroDAO.searchBoardList(keyField, keyWord);
		
		int listCount = railroDAO.countSearchBoardList(keyField, keyWord);
		
		model.addAttribute("board", board);
		model.addAttribute("listCount", listCount);
		
		return "railro.railroSearchList";
		
	}
	
}
	
	// method=RequestMethod 를 쓰지 않으면 GET, POST 방식 둘 다 받을 수 있음
	@RequestMapping(value="/railroDetail.htm")
	public String getDetail(){
		
		
		return "railro.railroDetail";
	}
	
	@RequestMapping(value="/railroEdit.htm", method=RequestMethod.GET)
	public String update() {
		return "railro.railroEdit";
	}
	
	@RequestMapping(value="/railroReg.htm", method=RequestMethod.GET)
	public String insert(
			Board board, HttpServletRequest request, Principal principal,
			// required = false : 파일 첨부가 필수는 아니다, true : 파일 첨부 필수
			// file 은 IOException 을 던져야 함. 그렇지 않으면 에러뜸
			@RequestParam(value="file", required=false) List<MultipartFile> files
			) throws ClassNotFoundException, SQLException, IOException {
		
		// BoardFile 을 List 로 받아 boardFiles 에 담음
		List<BoardFile> boardFiles = new ArrayList<BoardFile>();
		
		board.setWRITER(principal.getName());
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
		boardDAO.insert(board);
		
		// files에 담긴 개수만큼 for문을 돌면서 file 에 담아줌
		for(MultipartFile file : files){
			
			// file 이 null 이 아니고, file 이 비어있지 않으면 if문 실행
			if(file != null && !file.isEmpty()){
				
				String fname = file.getOriginalFilename();
				String path  = request.getServletContext().getRealPath("/customer/upload");
				String fpath = path + "\\" + fname;
				
				FileOutputStream fs = new FileOutputStream(fpath);
				fs.write(file.getBytes());
				fs.close();
				
				BoardFile boardFile = new BoardFile();
				boardFile.setORIGINFILENAME(file.getOriginalFilename());
			
				// 방금 insert한 게시물의 키를 뽑아와서  boardId 에 담아주고
				// boardFile 에 boardId 를 셋팅(같은 key 값을 가지게 됨)
				// inset 구문 2번 쓸 수 없을 때 사용
				int boardId = boardDAO.lastKey();
				boardFile.setBOARDID(boardId);
				
				boardDAO.insertFile(boardFile);
				
			}
			
		}
		
		board.setBoardFile(boardFiles);
		
		
		return "railro.railroReg";
	}
	
	@RequestMapping(value="/railroSearchList.htm", method=RequestMethod.GET)
	public String searchBoardList() {
		
		
		return "railro.railroSearchList";
	}
	
*/