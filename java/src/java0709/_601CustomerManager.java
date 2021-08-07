package java0709;

import java.util.Scanner;

public class _601CustomerManager {
	
	public static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];
	
	static int idx = -1;
	static int cnt = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		nameList[cnt] = name;
		genderList[cnt] = gender;
		emailList[cnt] = email;
		birthYearList[cnt] = birthYear;
		idx++;
		cnt++;
	}

	public static void printCustomerInfo() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		System.out.println("이름 : " + nameList[idx]);
		System.out.println("성별 : " + genderList[idx]);
		System.out.println("이메일 : " + emailList[idx]);
		System.out.println("출생년도 : " + birthYearList[idx]);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		System.out.println("이름 (" + nameList[idx] + ") : ");
		nameList[idx] = scan.next();
		System.out.println("성별 (" + genderList[idx] + ") : ");
		genderList[idx] = scan.next().charAt(0);
		System.out.println("이메일 (" + emailList[idx] + ") : ");
		emailList[idx] = scan.next();
		System.out.println("출생년도 (" + birthYearList[idx] + ") : ");
		birthYearList[idx] = scan.nextInt();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void deleteCustomerData() {
		for (int i = idx; i < cnt-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
		}
		idx--;
		cnt--;
	}
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.printf("\n[INFO]고객 수: %d, 인덱스: %d\n", cnt, idx);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				if(cnt>=MAX) {
					System.out.println("더 이상 입력할 수 없습니다.");
				} else {
					insertCustomerData();
					System.out.println("고객정보를 입력했습니다.");
				}
				break;

			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if (idx <=0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					idx--;
					printCustomerInfo();
				}
				break;

			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if (idx < cnt-1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					idx++;
					printCustomerInfo();
				}
				break;

			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if (idx>=0 && idx <cnt) {
					printCustomerInfo();
				} else {
					System.out.println("선택된 데이터가 존재하지 않습니다.");
				}
				break;

			case 'u':
				System.out.println("데이터를 수정합니다.");
				if (idx>=0 && idx <cnt) {
					System.out.println(idx + " 번째 데이터를 수정합니다.");
					updateCustomerData();
				} else {
					System.out.println("선택된 데이터가 존재하지 않습니다.");
				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (idx <cnt) {
					if (idx==0) {
						System.out.println(idx + "번째 데이터를 삭제합니다.");
						deleteCustomerData();
						idx++;
					} else if (idx>0) {
						System.out.println(idx + "번째 데이터를 삭제합니다.");
						deleteCustomerData();
					}
				}else {
					System.out.println("선택된 데이터가 존재하지 않습니다.");
				}
				break;
				
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 잘 못 입력했습니다.");
			} //end switch
		}//end while		
	}//end main

}//end class
