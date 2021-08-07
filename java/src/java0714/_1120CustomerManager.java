package java0714;

import java.util.ArrayList;
import java.util.Scanner;

import java0712._703Customer;

public class _1120CustomerManager {

	static ArrayList<_703Customer> custList = new ArrayList<_703Customer>();
	
	static int idx = -1;
	static int cnt = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void insertCustomerData() {
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("����(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = scan.next();
		System.out.print("����⵵ : ");
		int birthYear = scan.nextInt();
		
		_703Customer cust = new _703Customer(name, gender, email, birthYear);
		
		custList.add(cust);
	}

	public static void printCustomerInfo() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		_703Customer cust = custList.get(idx);
		System.out.println("�̸� : " + cust.getName());
		System.out.println("���� : " + cust.getGender());
		System.out.println("�̸��� : " + cust.getEmail());
		System.out.println("����⵵ : " + cust.getBirthYear());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		_703Customer cust = custList.get(idx);
		System.out.println("�̸� (" + cust.getName() + ") : ");
		cust.setName(scan.next());
		System.out.println("���� (" + cust.getGender() + ") : ");
		cust.setGender(scan.next().charAt(0));
		System.out.println("�̸��� (" + cust.getEmail() + ") : ");
		cust.setEmail(scan.next());
		System.out.println("����⵵ (" + cust.getBirthYear() + ") : ");
		cust.setBirthYear(scan.nextInt());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void deleteCustomerData() {
		custList.remove(idx);
	}
	
	public static void main(String[] args) {
		
		while(true) {
			cnt = custList.size();
			System.out.printf("\n[INFO]�� ��: %d, �ε���: %d\n", cnt, idx);
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴� �Է�: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("������ �Է��� �����մϴ�.");
				insertCustomerData();
				System.out.println("�������� �Է��߽��ϴ�.");
				break;

			case 'p':
				System.out.println("���� �����͸� ����մϴ�.");
				if (idx <=0) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					idx--;
					printCustomerInfo();
				}
				break;

			case 'n':
				System.out.println("���� �����͸� ����մϴ�.");
				if (idx >= cnt-1) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					idx++;
					printCustomerInfo();
				}
				break;

			case 'c':
				System.out.println("���� �����͸� ����մϴ�.");
				if (idx>=0 && idx <cnt) {
					printCustomerInfo();
				} else {
					System.out.println("���õ� �����Ͱ� �������� �ʽ��ϴ�.");
				}
				break;

			case 'u':
				System.out.println("�����͸� �����մϴ�.");
				if (idx>=0 && idx <cnt) {
					System.out.println(idx + " ��° �����͸� �����մϴ�.");
					updateCustomerData();
				} else {
					System.out.println("���õ� �����Ͱ� �������� �ʽ��ϴ�.");
				}
				break;

			case 'd':
				System.out.println("�����͸� �����մϴ�.");
				if ((idx>=0) && (idx < cnt)) {
						System.out.println(idx + "��° �����͸� �����մϴ�.");
						deleteCustomerData();
				}else {
					System.out.println("���õ� �����Ͱ� �������� �ʽ��ϴ�.");
				}
				break;
				
			case 'q':
				System.out.println("���α׷��� �����մϴ�.");
				scan.close();
				System.exit(0);
				break;
				
			default :
				System.out.println("�޴��� �� �� �Է��߽��ϴ�.");
			} //end switch
		}//end while		
	}//end main

}//end class
