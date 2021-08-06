package com.kosa.myapp.board.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kosa.myapp.board.dao.IBoardRepository;
import com.kosa.myapp.board.model.Board;
import com.kosa.myapp.board.model.BoardUploadFile;
import com.kosa.myapp.board.service.IBoardService;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	IBoardRepository boardRepository;
	
	@Transactional
	public void insertArticle(Board board) {
		board.setBoardId(boardRepository.selectMaxArticleNo()+1);
		boardRepository.insertArticle(board);
	}

	@Transactional
	public void insertArticle(Board board, BoardUploadFile file) {
		board.setBoardId(boardRepository.selectMaxArticleNo()+1);
		boardRepository.insertArticle(board);
		if(file != null && file.getFileName() != null &&
	!file.getFileName().equals("")) {
			file.setBoardId(board.getBoardId());
			file.setFileId(boardRepository.selectMaxFileId()+1);
			boardRepository.insertFileData(file);
		}
	}

	@Override
	public List<Board> selectArticleListByCategory(int categoryId, int page) {
		int start = (page-1) *10;
		return boardRepository.selectArticleListByCategory(categoryId, start, start+10);
	}

	@Override
	public List<Board> selectArticleListByCategory(int categoryId) {
		return boardRepository.selectArticleListByCategory(categoryId, 0, 100);
	}

	@Transactional
	public Board selectArticle(int boardId) {
		boardRepository.updateReadCount(boardId);
		return boardRepository.selectArticle(boardId);
	}

	@Override
	public BoardUploadFile getFile(int fileId) {
		return boardRepository.getFile(fileId);
	}

	@Transactional
	public void replyArticle(Board board) {
		boardRepository.updateReplyNumber(board.getMasterId(), board.getReplyNumber());
		board.setBoardId(boardRepository.selectMaxArticleNo()+1);
		board.setReplyNumber(board.getReplyNumber()+1);
		board.setReplyStep(board.getReplyStep()+1);
		boardRepository.replyArticle(board);
	}

	@Transactional
	public void replyArticle(Board board, BoardUploadFile file) {
		boardRepository.updateReplyNumber(board.getMasterId(), board.getReplyNumber());
		board.setBoardId(boardRepository.selectMaxArticleNo()+1);
		board.setReplyNumber(board.getReplyNumber()+1);
		board.setReplyStep(board.getReplyStep()+1);
		boardRepository.replyArticle(board);
		if(file != null && file.getFileName() != null &&
	!file.getFileName().equals("")) {
			file.setBoardId(board.getBoardId());
			boardRepository.insertFileData(file);
		}
	}

	@Override
	public String getPassword(int boardId) {
		return boardRepository.getPassword(boardId);
	}

	@Override
	public void updateArticle(Board board) {
		boardRepository.updateArticle(board);
	}

	@Transactional
	public void updateArticle(Board board, BoardUploadFile file) {
		boardRepository.updateArticle(board);
		if(file != null && file.getFileName() != null &&
	!file.getFileName().equals("")) {
			file.setBoardId(board.getBoardId());
			
			if(file.getFileId()>0) {
				boardRepository.updateFileData(file);
			} else {
				boardRepository.insertFileData(file);
			}
		}
	}

	@Override
	public Board selectDeleteArticle(int boardId) {
		return boardRepository.selectDeleteArticle(boardId);
	}

	@Transactional
	public void deleteArticle(int boardId, int replyNumber) {
		if(replyNumber>0) {
			boardRepository.deleteReplyFileData(boardId);
			boardRepository.deleteArticleByBoardId(boardId);
		} else if(replyNumber==0) {
			boardRepository.deleteFileData(boardId);
			boardRepository.deleteArticleByBoardId(boardId);
		} else {
			throw new RuntimeException("WRONG_REPLYNUMBER");
		}
	}

	@Override
	public int selectTotalArticleCount() {
		return boardRepository.selectTotalArticleCount();
	}

	@Override
	public int selectTotalArticleCountByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return boardRepository.selectTotalArticleCountByCategoryId(categoryId);
	}

	@Override
	public List<Board> searchListByContentKeyword(String keyword, int page) {
		int start = (page-1) * 10;
		return	boardRepository.searchListByContentKeyword("%"+keyword+"%");
	} 

	@Override
	public int selectTotalArticleCountByKeyword(String keyword) {
		return boardRepository.selectTotalArticleCountByKeyword("%"+keyword+"%");
	}

}
