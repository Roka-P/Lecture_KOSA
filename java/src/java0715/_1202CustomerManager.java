package java0715;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _1202CustomerManager {

	static ArrayList<_1202Customer> custList = new ArrayList<_1202Customer>();
	
	static int idx = -1;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void loadCustomerData() {
		String fileName = "customer.csv";
		FileReader reader = null;
		BufferedReader bufReader = null;
		try {
			reader = new FileReader(fileName);
			bufReader = new BufferedReader(reader);
			String line = null;
			do {
				line = bufReader.readLine();
				if(line != null) {
					String[] values = line.split(",");
					_1202Customer customer = new _1202Customer();
					customer.setName(values[0]);
					customer.setGender(values[1].charAt(0));
					customer.setEmail(values[2]);
					customer.setBirthYear(Integer.parseInt(values[3]));
					custList.add(customer);
				}
			}while(line != null);
			System.out.println("�����Ͱ� ���Ͽ��� �ε�ƽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("���Ͽ��� �����͸� �ҷ����� ���� ���� �߻� : " + e.getMessage());
		} finally {
			try { bufReader.close();} catch (IOException e) {}
			try { reader.close();} catch (IOException e) {}
		}
	}
	
	private static void saveCustomerData() {
		String fileName = "customer.csv";
		FileWriter writer = null;
		BufferedWriter bufWriter = null;
		try {
			writer = new FileWriter(fileName);
			bufWriter = new BufferedWriter(writer);
			for ( _1202Customer customer : custList) {
				bufWriter.write(customer.toCSV() + "\r\n");
			}
			bufWriter.flush();
			System.out.println("Customer �����Ͱ� ����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� �� ���� �߻� : " + e.getMessage());
		} finally {
			try { bufWriter.close();} catch (IOException e) {}
			try { writer.close();} catch (IOException e) {}
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
		
		_1202Customer cust = new _1202Customer(name, gender, email, birthYear);
		
		custList.add(cust);
	}

	public static void printCustomerData() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		_1202Customer cust = custList.get(idx);
		System.out.println("�̸� : " + cust.getName());
		System.out.println("���� : " + cust.getGender());
		System.out.println("�̸��� : " + cust.getEmail());
		System.out.println("����⵵ : " + cust.getBirthYear());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		_1202Customer cust = custList.get(idx);
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
