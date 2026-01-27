package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.Board;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO; 

	@Override
	public int insertBoard(Board board) throws Exception {
		int count = boardDAO.insertBoard(board);
		return count;
	}

	@Override
	public Board selectByNO(Board b) throws Exception {
		Board board = boardDAO.selectByNo(b); 
		return board;
	}

	@Override
	public int updateBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> boardList() throws Exception {
		List<Board> boardList = boardDAO.boardList(); 
		return boardList;
	}

}
