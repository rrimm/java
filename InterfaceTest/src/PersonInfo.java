import java.util.Scanner;

public class PersonInfo extends Person implements Personable {
	 
	String phone;
	String addr;

	public PersonInfo() {
		super();		// 자동삽입
	}
	
	public boolean input() {			// 메서드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		
		if(hakbun.equals("exit"))  	//equals 메소드를 사용하여 문자열 비교로 데이터를 더이상 입력하지 않고 빠져나옴
			return true;
		
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("전화번호 입력 => ");
		phone = scan.next();
		System.out.print("주소 입력 => ");
		addr = scan.next();
			return false;
		
	}

	public void output() {

	System.out.printf("%4s   %3s   %4s   %4s", hakbun, irum, phone, addr);
	}
	
}
