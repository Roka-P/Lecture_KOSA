package com.kosa.myapp.board.service;

import java.util.List;

import com.kosa.myapp.board.model.BoardCategory;

public interface IBoardCategoryService {
	List<BoardCategory> selectAllCategory();
	List<BoardCategory>	selectAllCategoryByClass1(int class1);
	void insertNewCategory(BoardCategory boardCategory);
	void updateCategory(BoardCategory boardCategory);
	void deleteCategory(int	categoryId);
}
