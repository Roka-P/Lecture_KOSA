package java0709;

import java.util.Scanner;

public class _602FoodManager {
	static final int MAX = 100;
	static String[] foodNameList = new String[MAX];
	static int[] countList = new int[MAX];
	static String[] expDateList = new String[MAX];
	static String[] descList = new String[MAX];
	
	static int idx = -1;
	static int cnt = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void insertFood() {
		System.out.println("이름 : "); foodNameList[cnt] = scan.next();
		System.out.println("수량 : "); countList[cnt] = scan.nextInt();
		System.out.println("유통기한 : "); expDateList[cnt] = scan.next();
		System.out.println("설명 : "); descList[cnt] = scan.next();
		cnt++;
	} 
	
	private static void printFoodList() {
		System.out.println("---------------------------------");
		System.out.println("이름\t수량\t유통기한\t설명\t");
		System.out.println("---------------------------------");
		for(int i =0; i<cnt; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n",foodNameList[i],countList[i],expDateList[i],descList[i]);
		}
		System.out.println("---------------------------------");
	}
	
	private static void updateFoodCount() {
		String food = scan.next();
		for (int i =0; i < cnt; i++) {
			if(foodNameList[i].equals(food)) {
				System.out.print("수량을 입력하세요: ");
				int cnt2 = scan.nextInt();
				if(cnt2 == 0) {
					for (int j=i; j<cnt-1; j++) {
						foodNameList[j] = foodNameList[j+1];
						countList[j] = countList[j+1];
						expDateList[j] = expDateList[j+1];
						descList[j] = descList[j+1];
					}
					cnt--;
				} else {
					countList[i] = cnt2;
				}
				return;
				}
			}
			System.out.println("수정할 식자재가 없습니다.");
		}
	
	private static void deleteFood() {
		System.out.print("삭제할 식자재 이름을 입력하세요: ");
		String food = scan.next();
		for(int i=0; i<cnt; i++) {
			if(foodNameList[i].equals(food)) {
				for (int j=i; j<cnt-1; j++) {
					foodNameList[j] = foodNameList[j+1];
					countList[j] = countList[j+1];
					expDateList[j] = expDateList[j+1];
					descList[j] = descList[j+1];
				}
				cnt--;
				return;
				} 
			}
		System.out.println("삭제할 식자재가 없습니다.");
		}
	
 	public static void main(String[] args) {
		while(true) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1.추가, 2.목록보기, 3.수정, 4.삭제, 0.종료");
			System.out.println("메뉴 : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("새로운 식자재를 추가합니다.");
				insertFood();
				break;
			case 2:
				System.out.println("식자재 목록을 출력합니다.");
				printFoodList();
				break;
			case 3:
				System.out.println("식자재 정보를 수정합니다.");
				updateFoodCount();
				break;
			case 4:
				System.out.println("식자재 정보를 삭제합니다.");
				deleteFood();
				break;
			case 0:
				System.out.println("식자재 관리 프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못된 메뉴입니다.");
				break;
			}//end switch
		}//end while
	}//end main
}//end class
