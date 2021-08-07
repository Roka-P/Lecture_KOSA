package java0715;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class _1204CustomerManager {

	static ArrayList<_1204Customer> custList = new ArrayList<_1204Customer>();
	
	static int idx = -1;
	static int cnt = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void loadCustomerData() {
		String fileName = "customer.data";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			custList = (ArrayList<_1204Customer>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e){
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(ois != null)
				try {ois.close();} catch (IOException e) {}
		}
	}
	
	private static void saveCustomerData() {
		String fileName = "customer.data";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(custList);
			System.out.println("�� �����Ͱ� ����ƽ��ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e){
			System.out.println(e.getMessage());
		} finally {
			if(oos != null)
				try {oos.close();} catch (IOException e) {}
		}
	}
	
	public static void insertCustomerData() {
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("����(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = scan.next();
		System.out.print("����⵵ : ");
		int birthYear = scan.nextInt();
		
		_1204Customer cust = new _1204Customer(name, gender, email, birthYear);
		
		custList.add(cust);
	}

	public static void printCustomerData() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		_1204Customer cust = custList.get(idx);
		System.out.println("�̸� : " + cust.getName());
		System.out.println("���� : " + cust.getGender());
		System.out.println("�̸��� : " + cust.getEmail());
		System.out.println("����⵵ : " + cust.getBirthYear());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		_1204Customer cust = custList.get(idx);
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
		
		 loadCustomerData();
		
		while(true) {
			System.out.printf("\n[INFO]�� ��: %d, �ε���: %d\n", custList.size(), idx);
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(S)ave, (I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("�޴� �Է�: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 's':
				System.out.println("�������� �����մϴ�.");
				saveCustomerData();
				break;
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
					printCustomerData();
				}
				break;

			case 'n':
				System.out.println("���� �����͸� ����մϴ�.");
				if (idx >= custList.size()-1) {
					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
				} else {
					idx++;
					printCustomerData();
				}
				break;

			case 'c':
				System.out.println("���� �����͸� ����մϴ�.");
				if (idx>=0 && idx < custList.size()) {
					printCustomerData();
				} else {
					System.out.println("���õ� �����Ͱ� �������� �ʽ��ϴ�.");
				}
				break;

			case 'u':
				System.out.println("�����͸� �����մϴ�.");
				if (idx>=0 && idx <custList.size()) {
					System.out.println(idx + " ��° �����͸� �����մϴ�.");
					updateCustomerData();
				} else {
					System.out.println("���õ� �����Ͱ� �������� �ʽ��ϴ�.");
				}
				break;

			case 'd':
				System.out.println("�����͸� �����մϴ�.");
				if ((idx>=0) && (idx < custList.size())) {
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
