package gugudan;
import java.util.Scanner;

public class Gugudan1 {

	public static void main(String[] args) {
		System.out.println("임의의 두수를 입력 받아 작은 수에서 큰 수까지의 구구단을 출력하시오.");  
		/*1. 두 숫자를 입력받는다.
		  2. 두수 중에서 큰숫자와 작은 숫자를 구한다.
		  3. 구구단의 단제목을 출력한다.
		  4. 구구단을 출력한다. */
		
		int num1, num2; 
		int min, max;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 => ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 => ");
		num2 = scan.nextInt();
		
		if(num1 < num2) {
			min = num1;
			max = num2;
		}
		else {
			min = num2;
			max = num1;
		}
			
		for(int i = min; i <= max ; i++) {
			
		System.out.print("*** "+ i +"단 ***  ");
		
		}
		
		System.out.println();
		
		for(int j = 1; j < 10; j++ ) {
			for(int i = min; i <= max; i++) {
			System.out.printf("%d * %d = %d   ", i, j, i*j);
			}
			System.out.println();
		}
		
		
	}

}
