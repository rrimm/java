package hashmap;

import java.util.Scanner;

public class Employees {
	String emID;
	String deptname;
	String name;
	String gender;
	String email;

	 Employees() {
		 
	 }

	
	public String getID() {	// empID에서 값을 반환, 읽어올 때 사용할 메소드. 접근자: 필드에 접근하기 위한 용도
		return emID;
	}
	public void setID(String emID) {	// empID에 값 저장할 때 사용할 메소드
		this.emID = emID;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void inputData() { // inputData(): 사원정보 저장

		Scanner scan = new Scanner(System.in);

		System.out.print("사원정보 입력 => ");
		emID = scan.next();
		System.out.print("부서명 입력 => ");
		deptname = scan.next();
		System.out.print("이름 입력 => ");
		name = scan.next();
		System.out.print("성별 입력 => ");
		gender = scan.next();
		System.out.print("이메일 입력 => ");
		email = scan.next();

	}

	public void outputData() { // 입력받은 사원정보 출력 . 데이터가 없으면 데이터가 없다고 메세지

		System.out.printf("%3s\t%3s\t%3s\t%3s\t%s\t%n", emID, deptname, name, gender, email);

	}
	
	
}

//문제: 사원정보를 입력받아 사원 정보를 관리하는 프로그램이다. 주어진 메뉴 기능을 완성하시오.
//
//클래스명: Employee
//필드명:
//	사원번호: empID
//	부서명: deptname
//	이름: name
//	성별: gender
//	이메일: email
//	
//메서드: 
//	inputData(): 사원정보 입력
//	outputData(): 사원정보 출력

