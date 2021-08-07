package java0712;

public class _704Food {
	private String foodName;
	private int count;
	private String expDate;
	private String etc;
	
	public _704Food() {}
	
	public _704Food(String foodName, int count, String expDate, String etc) {
		this.foodName = foodName;
		this.count = count;
		this.expDate = expDate;
		this.etc = etc;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", count=" + count + ", expDate=" + expDate + ", etc=" + etc +"]";
	}
	
}
