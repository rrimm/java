package primenumber;
import java.util.Scanner;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
		System.out.println("임의의 두수를 입력 받아 작은 수에서 큰 수까지의 소수(Prime Number)를 구해서 출력하시오."); 
/* 처리조건
 * 한줄에 소수를 10개씩 출력한다.
 * 마지막에 총소수의 개수를 출력한다.
 * 소수: 1과 자기자신을 제외하고 약수가 없는 수 - 특정한 숫자를 1과 자기 자신을 제외하고 나머지값이 0이 나오지 않으면 됨
 * 작은 숫자에서 큰 숫자까지 하나의 루프가 필요할 것
 * 첫번째 10의 경우 자기 자신을 제외한 수 2~9로 나누고 나머지값 확인
 * 소수를 카운트
 * i란 변수가 10~ 100까지 변할 수 있도록 루프
 * i가 소수인지 확인할 수 있도록 반복문
*/
		
		int num1, num2; 
		int min, max;
		int count = 0;
		
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
			
		
			
				for(int i = 2; i < max; i++) {
					
					int sol = 0;
					
					for(int j = 1; j<=i; j++) {
							if(i%j == 0) {
								sol += 1;
							}
					}
					
						if( sol == 2) {
							count +=1;
							
							if(cnt % 10 != 0)
								System.out.println();
							
							System.out.printf("%d  ", i);
							
							
						}
						
				}
				System.out.println();
				System.out.println("총소수 개수: "+count);
					
					
			
			
				
				
				
			
		}
			
				
		
		
		
		
		
	}

		//for(int j = )
		//	if(i%(i-j) != 0) {

		
