package java0712;

import java.util.Scanner;

public class _703CustomerManager {
	
	public static final int MAX = 100;
	
	static _703Customer[] custList = new _703Customer[MAX];
	
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
		
		_703Customer customer = new _703Customer();
		customer.setName(name);
		customer.setGender(gender);
		customer.setEmail(email);
		customer.setBirthYear(birthYear);
		custList[cnt] = customer;
		cnt++;
	}

	public static void printCustomerInfo() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		_703Customer customer = custList[idx];
		System.out.println("�̸� : " + customer.getName());
		System.out.println("���� : " + customer.getGender());
		System.out.println("�̸��� : " + customer.getEmail());
		System.out.println("����⵵ : " + customer.getBirthYear());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		_703Customer customer = custList[idx];
		System.out.println("�̸� (" + customer.getName() + ") : ");
		customer.setName(scan.next());
		System.out.println("���� (" + customer.getGender() + ") : ");
		customer.setGender(scan.next().charAt(0));
		System.out.println("�̸��� (" + customer.getEmail() + ") : ");
		customer.setEmail(scan.next());
		System.out.println("����⵵ (" + customer.getBirthYear() + ") : ");
		customer.setBirthYear(scan.nextInt());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void deleteCustomerData() {
		for (int i = idx; i < cnt-1; i++) {
			custList[i] = custList[i+1];
		}
		cnt--;
	}
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.printf("\n[INFO]�� ��: %d, �ε���: %d\n", cnt, idx);
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴� �Է�: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("������ �Է��� �����մϴ�.");
				if(cnt>=MAX) {
					System.out.println("�� �̻� �Է��� �� �����ϴ�.");
				} else {
					insertCustomerData();
					System.out.println("�������� �Է��߽��ϴ�.");
				}
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
