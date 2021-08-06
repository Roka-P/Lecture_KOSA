package com.kosa.myapp.board.service;

import java.util.List;

import com.kosa.myapp.board.model.Board;
import com.kosa.myapp.board.model.BoardUploadFile;

public interface IBoardService {
	void insertArticle(Board board);
	void insertArticle(Board board, BoardUploadFile file);
	
	List<Board>	selectArticleListByCategory(int	categoryId,	int	page);
	List<Board>	selectArticleListByCategory(int	categoryId);
	 
	Board selectArticle(int	boardId);
	
	BoardUploadFile	getFile(int	fileId);
	void replyArticle(Board	board);
	void replyArticle(Board	board, BoardUploadFile file);
	
	String getPassword(int boardId);
	
	void updateArticle(Board board);
	void updateArticle(Board board,	BoardUploadFile	file);
	
	Board selectDeleteArticle(int boardId);
	void deleteArticle(int boardId, int replyNumber);
	
	int selectTotalArticleCount();
	int	selectTotalArticleCountByCategoryId(int	categoryId);
	
	List<Board>	searchListByContentKeyword(String keyword, int page);
	int	selectTotalArticleCountByKeyword(String	keyword);
	}
