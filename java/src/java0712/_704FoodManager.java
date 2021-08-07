package java0712;

import java.util.Scanner;

public class _704FoodManager {
	static final int MAX = 100;
	static _704Food[] foodList = new _704Food[MAX];
	static int idx = -1;
	static int cnt = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void insertFood() {
		_704Food food = new _704Food();
		System.out.println("�̸� : "); ; food.setFoodName(scan.next());
		System.out.println("���� : "); food.setCount(scan.nextInt());
		System.out.println("������� : "); food.setExpDate(scan.next());
		System.out.println("���� : "); food.setEtc(scan.next());
		foodList[cnt++] = food;
	} 
	
	private static void printFoodList() {
		System.out.println("---------------------------------");
		System.out.println("�̸�\t����\t�������\t����\t");
		System.out.println("---------------------------------");
		for(int i =0; i<cnt; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n",foodList[i].getFoodName(),foodList[i].getCount(),foodList[i].getExpDate(),foodList[i].getEtc());
		}
		System.out.println("---------------------------------");
	}

	private static void updateFoodCount() {
		String food = scan.next();
		for (int i =0; i < cnt; i++) {
			if(foodList[i].getFoodName().equals(food)) {
				System.out.print("������ �Է��ϼ���: ");
				int cnt2 = scan.nextInt();
				if(cnt2 == 0) {
					for (int j=i; j<cnt-1; j++) {
						foodList[j] = foodList[j+1];
						}
					cnt--;
				} else {
					foodList[i].setCount(cnt2);;
				}
				return;
				}
			}
			System.out.println("������ �����簡 �����ϴ�.");
		}
	
	private static void deleteFood() {
		System.out.print("������ ������ �̸��� �Է��ϼ���: ");
		String food = scan.next();
		for(int i=0; i<cnt; i++) {
			if(foodList[i].getFoodName().equals(food)) {
				for (int j=i; j<cnt-1; j++) {
					foodList[j] = foodList[j+1];
				}
				cnt--;
				return;
				} 
			}
		System.out.println("������ �����簡 �����ϴ�.");
		}
	
 	public static void main(String[] args) {
		while(true) {
			System.out.println("�޴��� �Է��ϼ���");
			System.out.println("1.�߰�, 2.��Ϻ���, 3.����, 4.����, 0.����");
			System.out.println("�޴� : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("���ο� �����縦 �߰��մϴ�.");
				insertFood();
				break;
			case 2:
				System.out.println("������ ����� ����մϴ�.");
				printFoodList();
				break;
			case 3:
				System.out.println("������ ������ �����մϴ�.");
				updateFoodCount();
				break;
			case 4:
				System.out.println("������ ������ �����մϴ�.");
				deleteFood();
				break;
			case 0:
				System.out.println("������ ���� ���α׷��� �����մϴ�.");
				System.exit(0);
			default :
				System.out.println("�߸��� �޴��Դϴ�.");
				break;
			}//end switch
		}//end while
	}//end main
}//end class
