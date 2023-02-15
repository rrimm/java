package test1;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 => ");
		int num = scan.nextInt();
		StringStack str = new StringStack(num);
		String val;

		while (true) {
			System.out.println("문자열 입력 >> ");
			val = scan.next();
			if (val.equals("그만"))
				break;
			
			str.push(val);
			
		}
		str.print();
	}

}
