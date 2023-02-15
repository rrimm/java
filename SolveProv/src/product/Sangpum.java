package product;
import java.util.Scanner;

public class Sangpum {
	String code; // 상품코드
	String name;  // 이름
	int amount;  // 수량
	int price;   // 단가
	int cost;  // 금액
	
	
	public Sangpum() {
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("상품코드 입력 => ");
		code = scan.next();
		System.out.println("상품명 입력 => ");
		name = scan.next();
		System.out.println("수량 입력 => ");
		amount = scan.nextInt();
		System.out.println("단가 입력 => ");
		price = scan.nextInt();
		
	}
		
	
	void calculate() {
		
		cost = amount * price;
		
	}

	void output() {
		
	System.out.printf("%4s %6s %4d  %7d  %8d\n", code, name, amount, price, cost);
		
	}

}
