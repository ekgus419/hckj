package com.hongchaegojung.railro.controllers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hongchaegojung.railro.dao.BoardDAO;
import com.hongchaegojung.railro.dto.Board;
import com.hongchaegojung.railro.dto.BoardFile;

@Controller
@RequestMapping("/railro")
public class RailroController {
	
<<<<<<< HEAD
/*	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="/railroList.htm", method=RequestMethod.GET)
	public String getBoardList() {
=======
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value={"railroList.htm"}, method=RequestMethod.GET)
	public String test1() {
>>>>>>> 8521074db796575873dd59a426f406561b1b8fbc
		return "railro.railroList";
	}
	
	// method=RequestMethod �� ���� ������ GET, POST ��� �� �� ���� �� ����
<<<<<<< HEAD
	@RequestMapping(value="/railroDetail.htm")
	public String getDetail(){
=======
	@RequestMapping(value={"railroDetail.htm"})
	public String insert(
			Board board, HttpServletRequest request, Principal principal,
			// required = false : ���� ÷�ΰ� �ʼ��� �ƴϴ�, true : ���� ÷�� �ʼ�
			// file �� IOException �� ������ ��. �׷��� ������ ������
			@RequestParam(value="file", required=false) List<MultipartFile> files
			) throws ClassNotFoundException, SQLException, IOException {
		
		// BoardFile �� List �� �޾� boardFiles �� ����
		List<BoardFile> boardFiles = new ArrayList<BoardFile>();
		
		board.setWRITER(principal.getName());
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
		boardDAO.insert(board);
		
		// files�� ��� ������ŭ for���� ���鼭 file �� �����
		for(MultipartFile file : files){
			
			// file �� null �� �ƴϰ�, file �� ������� ������ if�� ����
			if(file != null && !file.isEmpty()){
				
				String fname = file.getOriginalFilename();
				String path  = request.getServletContext().getRealPath("/customer/upload");
				String fpath = path + "\\" + fname;
				
				FileOutputStream fs = new FileOutputStream(fpath);
				fs.write(file.getBytes());
				fs.close();
				
				BoardFile boardFile = new BoardFile();
				boardFile.setORIGINFILENAME(file.getOriginalFilename());
			
				// ��� insert�� �Խù��� Ű�� �̾ƿͼ�  boardId �� ����ְ�
				// boardFile �� boardId �� ����(���� key ���� ������ ��)
				// inset ���� 2�� �� �� ���� �� ���
				int boardId = boardDAO.lastKey();
				boardFile.setBOARDID(boardId);
				
				boardDAO.insertFile(boardFile);
				
			}
			
		}
		
		board.setBoardFile(boardFiles);
>>>>>>> 8521074db796575873dd59a426f406561b1b8fbc
		
		
		return "railro.railroDetail";
	}
	
	@RequestMapping(value="/railroEdit.htm", method=RequestMethod.GET)
	public String update() {
		return "railro.railroEdit";
	}
	
<<<<<<< HEAD
	@RequestMapping(value="/railroReg.htm", method=RequestMethod.GET)
	public String insert(
			Board board, HttpServletRequest request, Principal principal,
			// required = false : ���� ÷�ΰ� �ʼ��� �ƴϴ�, true : ���� ÷�� �ʼ�
			// file �� IOException �� ������ ��. �׷��� ������ ������
			@RequestParam(value="file", required=false) List<MultipartFile> files
			) throws ClassNotFoundException, SQLException, IOException {
		
		// BoardFile �� List �� �޾� boardFiles �� ����
		List<BoardFile> boardFiles = new ArrayList<BoardFile>();
		
		board.setWRITER(principal.getName());
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
		boardDAO.insert(board);
		
		// files�� ��� ������ŭ for���� ���鼭 file �� �����
		for(MultipartFile file : files){
			
			// file �� null �� �ƴϰ�, file �� ������� ������ if�� ����
			if(file != null && !file.isEmpty()){
				
				String fname = file.getOriginalFilename();
				String path  = request.getServletContext().getRealPath("/customer/upload");
				String fpath = path + "\\" + fname;
				
				FileOutputStream fs = new FileOutputStream(fpath);
				fs.write(file.getBytes());
				fs.close();
				
				BoardFile boardFile = new BoardFile();
				boardFile.setORIGINFILENAME(file.getOriginalFilename());
			
				// ��� insert�� �Խù��� Ű�� �̾ƿͼ�  boardId �� ����ְ�
				// boardFile �� boardId �� ����(���� key ���� ������ ��)
				// inset ���� 2�� �� �� ���� �� ���
				int boardId = boardDAO.lastKey();
				boardFile.setBOARDID(boardId);
				
				boardDAO.insertFile(boardFile);
				
			}
			
		}
		
		board.setBoardFile(boardFiles);
=======
	@RequestMapping(value={"railroReg.htm"}, method=RequestMethod.GET)
	public String test4() {
>>>>>>> 8521074db796575873dd59a426f406561b1b8fbc
		
		
		return "railro.railroReg";
	}
	
	@RequestMapping(value="/railroSearchList.htm", method=RequestMethod.GET)
	public String searchBoardList() {
		
		
		return "railro.railroSearchList";
	}
	
	*/
}

