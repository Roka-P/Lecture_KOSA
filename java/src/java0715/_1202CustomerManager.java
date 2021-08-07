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
			System.out.println("데이터가 파일에서 로드됐습니다.");
		} catch (IOException e) {
			System.out.println("파일에서 데이터를 불러오는 도중 예외 발생 : " + e.getMessage());
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
			System.out.println("Customer 데이터가 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("파일 저장 중 예외 발생 : " + e.getMessage());
		} finally {
			try { bufWriter.close();} catch (IOException e) {}
			try { writer.close();} catch (IOException e) {}
		}
	}
	
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		_1202Customer cust = new _1202Customer(name, gender, email, birthYear);
		
		custList.add(cust);
	}

	public static void printCustomerData() {
		System.out.println("=-=-=-=-=-=-=CUSTOMER INFO=-=-=-=-=-=-=");
		_1202Customer cust = custList.get(idx);
		System.out.println("이름 : " + cust.getName());
		System.out.println("성별 : " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("출생년도 : " + cust.getBirthYear());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void updateCustomerData() {
		System.out.println("=-=-=-=-=UPDATE CUSTOMER INFO=-=-=-=-=");
		_1202Customer cust = custList.get(idx);
		System.out.println("이름 (" + cust.getName() + ") : ");
		cust.setName(scan.next());
		System.out.println("성별 (" + cust.getGender() + ") : ");
		cust.setGender(scan.next().charAt(0));
		System.out.println("이메일 (" + cust.getEmail() + ") : ");
		cust.setEmail(scan.next());
		System.out.println("출생년도 (" + cust.getBirthYear() + ") : ");
		cust.setBirthYear(scan.nextInt());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void deleteCustomerData() {
		custList.remove(idx);
	}
	
	public static void main(String[] args) {
		
		 loadCustomerData();
		
		while(true) {
			System.out.printf("\n[INFO]고객 수: %d, 인덱스: %d\n", custList.size(), idx);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(S)ave, (I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 's':
				System.out.println("고객정보를 저장합니다.");
				saveCustomerData();
				break;
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				insertCustomerData();
				System.out.println("고객정보를 입력했습니다.");
				break;

			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if (idx <=0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					idx--;
					printCustomerData();
				}
				break;

			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if (idx >= custList.size()-1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					idx++;
					printCustomerData();
				}
				break;

			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if (idx>=0 && idx < custList.size()) {
					printCustomerData();
				} else {
					System.out.println("선택된 데이터가 존재하지 않습니다.");
				}
				break;

			case 'u':
				System.out.println("데이터를 수정합니다.");
				if (idx>=0 && idx <custList.size()) {
					System.out.println(idx + " 번째 데이터를 수정합니다.");
					updateCustomerData();
				} else {
					System.out.println("선택된 데이터가 존재하지 않습니다.");
				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if ((idx>=0) && (idx < custList.size())) {
						System.out.println(idx + "번째 데이터를 삭제합니다.");
						deleteCustomerData();
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
