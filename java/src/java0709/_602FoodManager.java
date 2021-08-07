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
		System.out.println("�̸� : "); foodNameList[cnt] = scan.next();
		System.out.println("���� : "); countList[cnt] = scan.nextInt();
		System.out.println("������� : "); expDateList[cnt] = scan.next();
		System.out.println("���� : "); descList[cnt] = scan.next();
		cnt++;
	} 
	
	private static void printFoodList() {
		System.out.println("---------------------------------");
		System.out.println("�̸�\t����\t�������\t����\t");
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
				System.out.print("������ �Է��ϼ���: ");
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
			System.out.println("������ �����簡 �����ϴ�.");
		}
	
	private static void deleteFood() {
		System.out.print("������ ������ �̸��� �Է��ϼ���: ");
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
