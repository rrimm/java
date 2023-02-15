package product;
import java.util.Scanner;
	
public class Sangpum2 {
	

	String code; // 상품코드
	String name;  // 이름
	int amount;  // 수량
	int price;   // 단가
	int cost;  // 금액
	
	
	public Sangpum2() {
	}
	
	boolean input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("상품코드 입력 => ");
		code = scan.next();
		if(code.equals("exit")) 	//equals 메소드를 사용하여 문자열 비교로 데이터를 더이상 입력하지 않고 빠져나옴
			return true;
		System.out.println("상품명 입력 => ");
		name = scan.next();
		System.out.println("수량 입력 => ");
		amount = scan.nextInt();
		System.out.println("단가 입력 => ");
		price = scan.nextInt();
		return false;
	}
		
	
	void calculate() {
		
		cost = amount * price;
		
	}

	void output() {
	
	System.out.printf("%4s %6s %4d  %7d  %8d\n", code, name, amount, price, cost);
		
}
}
