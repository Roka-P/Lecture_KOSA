package com.kosa.myapp.board.model;

public class BoardCategory {
	private int categoryId;					//카테고리 아이디
	private int categoryClass1;				//카테고리 대분류
	private int categoryClass2;				//카테고리 중분류
	private String categoryName;			//카테고리 이름
	private String categoryDescription;		//카테고리 설명
	private int categoryOrder;				//카테고리를 출력할 때의 순서
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCategoryClass1() {
		return categoryClass1;
	}
	public void setCategoryClass1(int categoryClass1) {
		this.categoryClass1 = categoryClass1;
	}
	public int getCategoryClass2() {
		return categoryClass2;
	}
	public void setCategoryClass2(int categoryClass2) {
		this.categoryClass2 = categoryClass2;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescrription() {
		return categoryDescription;
	}
	public void setCategoryDescrription(String categoryDescrription) {
		this.categoryDescription = categoryDescrription;
	}
	public int getCategoryOrder() {
		return categoryOrder;
	}
	public void setCategoryOrder(int categoryOrder) {
		this.categoryOrder = categoryOrder;
	}
	
	@Override
	public String toString() {
		return "BoardCategory [categoryId=" + categoryId + ", categoryClass1=" + categoryClass1 + ", categoryClass2="
				+ categoryClass2 + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
				+ ", categoryOrder=" + categoryOrder + "]";
	}
	
}
