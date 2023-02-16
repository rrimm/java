package hashmap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<String, Employees> hashmap = new HashMap<String, Employees>();
		int menu;

		Scanner scan = new Scanner(System.in);

		while (true) {
			print_menu();
			System.out.println("\n메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.printf("\n프로그램 종료...\n");
				break;
			}

			switch (menu) {
			case 1: // 입력
				
				System.out.println();
				input_employee(hashmap);
				break;

			case 2: // 출력

				output_employee(hashmap);
				break;

			case 3: // 조회(검색)
				search_employee(hashmap);
				break;

			case 4: // 수정
				update_employee(hashmap);
				break;
			case 5: // 삭제
				delete_employee(hashmap);
				break;
			default:
				System.out.printf("\n메뉴를 다시 입력하세요!!!\n");
				break;

			}

		}

	}

	static void print_menu() {
		System.out.printf("\n*** 사원관리 ***\n");
		System.out.printf("1. 사원정보 입력\n");
		System.out.printf("2. 사원정보 출력\n");
		System.out.printf("3. 사원정보 조회\n");
		System.out.printf("4. 사원정보 수정\n");
		System.out.printf("5. 사원정보 삭제\n");
		System.out.printf("6. 프로그램 종료\n");

	}

	static void input_employee(HashMap<String, Employees> hashmap) { // inputData(): 사원정보 저장
		
		Employees obj = new Employees();
		obj.inputData();
			
		//if (hashmap.get(obj.emID) != null) {
			if (hashmap.containsKey(obj.emID)) {
				System.out.println("\n사원번호 입력 오류(중복)!!\n");
				return;
			
		}
		hashmap.put(obj.emID, obj);
		System.out.println("\n사원정보 입력 성공!!\n");

	}

	static void output_employee(HashMap<String, Employees> hashmap) {
		// 1. keySet() 사용
		Set<String> keyset = hashmap.keySet(); 	// hashmap에 존재하는 키 집합 구함
		
		if (keyset.size() == 0) {	//if (map.isEmpty())
			System.out.println("출력할 사원정보가 없습니다!!\n");
			return;
		}

		System.out.printf("\n*** 사원정보 ***\n");
		System.out.println("=====================================");
		System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
		System.out.println("=====================================");
		
		for(String emID : keyset) {
		Employees obj = hashmap.get(emID);
			obj.outputData();
		}
		
		System.out.println("=====================================");
		System.out.printf("\t\t 총사원수 : %d\n\n", hashmap.size());
		
//		// 2. entrySet() 사용
//		Set entryset = hashmap.entrySet(); 	// hashmap에 존재하는 키 집합 구함
//		
//		if (entryset.size() == 0) {	//if (map.isEmpty())
//			System.out.println("출력할 사원정보가 없습니다!!\n");
//			return;
//		}
//
//		System.out.printf("\n*** 사원정보 ***\n");
//		System.out.println("=====================================");
//		System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
//		System.out.println("=====================================");
//		Iterator it_entry = entryset.iterator();
//		while(it_entry.hasNext()) {
//			// 키와 값을 읽기 위해 Map.Entry로 캐스트 연산
//		Map.Entry e = (Map.Entry)it_entry.next(); 
//		// e.getValue(): 데이터값을 읽어옴, e.getKey(): 키 값을 읽어옴
//		//e.getValue()의 리턴타입이 오브젝트 클래스이므로 
//		Employees obj = (Employees)e.getValue();
//			obj.outputData();
//		}
//		
//		System.out.println("=====================================");
//		System.out.printf("\t\t 총사원수 : %d\n\n", hashmap.size());
//		
//		// 3.
//		
//		if (hashmap.size() == 0) { // if (hashmap.isEmpty())
//			System.out.println("출력할 사원정보가 없습니다!!\n");
//			return;
//		}
//
//		System.out.printf("\n*** 사원정보 ***\n");
//		System.out.println("=====================================");
//		System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
//		System.out.println("=====================================");
//
//		for (Employees obj : hashmap.values()) {
//			obj.outputData();
//		}
//
//		System.out.println("=====================================");
//		System.out.printf("\t\t 총사원수 : %d\n\n", hashmap.size());
		
	}

	static void search_employee(HashMap<String, Employees> hashmap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 사원번호 입력 => ");
		String emID = scan.next();

			Employees obj = hashmap.get(emID);
			if (obj != null) {
				System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
				System.out.println("=====================================");
				obj.outputData();
				System.out.println("=====================================");
				return;
			
		}
	}

	public static void update_employee(HashMap<String, Employees> hashmap) { // 수정
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 사원번호 입력 => ");
		String emID = scan.next();
		
		Employees obj = hashmap.get(emID);
		if (obj != null) {

			System.out.print("부서명 입력 => ");
			obj.setDeptname(scan.next());
			System.out.print("이름 입력 => ");
			obj.setName(scan.next());
			System.out.print("성별 입력 => ");
			obj.setGender(scan.next());
			System.out.print("이메일 입력 => ");
			obj.setEmail(scan.next());
			System.out.println("\n사원정보 수정 성공!!\n");
			return;
		}
		System.out.println("\n수정할 사원번호 입력 오류!!\n");
	}

	public static void delete_employee(Map<String, Employees> hashmap) { // 삭제
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 사원번호 입력 => ");
		String emID = scan.next();

		Employees obj = hashmap.get(emID);
		if (obj != null) {
			hashmap.remove(emID);
			System.out.println("\n사원정보 삭제 성공!!\n");
			return;
		}

		System.out.println("\n삭제할 사원번호 입력 오류!!\n");

	}
}
