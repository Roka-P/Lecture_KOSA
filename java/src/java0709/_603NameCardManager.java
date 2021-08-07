package java0709;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.text.DefaultEditorKit.InsertContentAction;

public class _603NameCardManager {
	static final int MAX = 100;
	static String[] nameList = new String[MAX];
	static String[] officeNameList = new String[MAX];
	static String[] jobList = new String[MAX];
	static String[] phoneList = new String[MAX];
	static String[] officePhoneList = new String[MAX];
	static String[] emailList = new String[MAX];
	
	static int idx = -1;
	static int cnt = 0; 
	
	static Scanner scan = new Scanner(System.in);
	
	private static void insertNameCard() {
		System.out.print("Name : "); String name = scan.next();
		System.out.print("Office Name : ");	String officename = scan.next();
		System.out.print("Job : "); String job = scan.next();
		System.out.print("Phone : "); String phone = scan.next();
		System.out.print("Office Phone  : "); String officePhone = scan.next();
		System.out.print("E-mail : "); String email = scan.next();
		
		nameList[cnt] = name;
		officeNameList[cnt] = officename;
		jobList[cnt] = job;
		phoneList[cnt] = phone;
		officePhoneList[cnt] = officePhone;
		emailList[cnt] = email;
		cnt++;
	}
		
	private static void selectNameCard() {
		String name = scan.next();
		for (int i =0; i < cnt; i++) {
			if(nameList[i].equals(name)) {
				System.out.println("=-=-=-=-=-=-=NAME CARD INFO=-=-=-=-=-=-=");
				System.out.println("Name : " + nameList[i]);
				System.out.println("Office Name : " + officeNameList[i]);
				System.out.println("Job : " + jobList[i]);
				System.out.println("Phone : " + phoneList[i]);
				System.out.println("Office Phone : " + officePhoneList[i]);
				System.out.println("이메일 : " + emailList[i]);
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				} else {
					System.out.println("존재하지 않는 명함입니다.");
				}
				return;
				}
			}
	
	private static void updateNameCard() {
		String name = scan.next();
		for (int i =0; i < cnt; i++) {
			if(nameList[i].equals(name)) {
				System.out.println("Name (" + nameList[i] + ") : ");
				nameList[i] = scan.next();
				System.out.println("Office Name (" + officeNameList[i] + ") : ");
				officeNameList[i] = scan.next();
				System.out.println("Job (" + jobList[i] + ") : ");
				jobList[i] = scan.next();
				System.out.println("Phone (" + phoneList[i] + ") : ");
				phoneList[i] = scan.next();
				System.out.println("Office Phone (" + officePhoneList[i] + ") : ");
				officePhoneList[i] = scan.next();
				System.out.println("이메일 (" + emailList[i] + ") : ");
				emailList[i] = scan.next();
			} else {
				System.out.println("존재하지 않는 명함입니다.");
			}
			return;
			}
	}
	
	private static void printNameCardList() {
		System.out.println("---------------------------------");
		System.out.println("Name\tOfficeName\tJob\t");
		System.out.println("---------------------------------");
		for(int i =0; i<cnt; i++) {
			System.out.printf("%s\t%s\t%s\n",nameList[i],officeNameList[i],jobList[i]);
		}
		System.out.println("---------------------------------");
	}
	
	private static void deleteNameCard() {
		String name = scan.next();
		for (int i =0; i < cnt; i++) {
			if(nameList[i].equals(name)) {		
					nameList[i] = nameList[i+1];
					officeNameList[i] = officeNameList[i+1];
					jobList[i] = jobList[i+1];
					phoneList[i] = phoneList[i+1];
					officePhoneList[i] = officePhoneList[i+1];
					emailList[i] = emailList[i+1];
					cnt--;	
					} else {
					System.out.println("존재하지 않는 명함입니다.");
				}
				return;
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (L)ist, (S)elect, (U)pdate, (D)elete, (Q)uit");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("명함 정보를 입력합니다.");
				if(cnt>=MAX) {
					System.out.println("더 이상 입력할 수 없습니다.");
				} else {
					insertNameCard();
					System.out.println("명함 정보를 입력했습니다.");
				}
				break;

			case 'l':
				System.out.println("명함 목록을 출력합니다.");
				printNameCardList();
				break;	
				
			case 's':
				System.out.println("명함 정보를 조회합니다.");
				selectNameCard();
				break;

			case 'u':
				System.out.println("명함 정보를 수정합니다.");
				updateNameCard();
				break;

			case 'd':
				System.out.println("명함 정보를 삭제합니다.");
				deleteNameCard();
				break;
	
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 잘못 입력했습니다.");
			} //end switch
		}
	}

}
