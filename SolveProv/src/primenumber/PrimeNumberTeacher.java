package primenumber;
import java.util.Scanner;

public class PrimeNumberTeacher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;  //num이나 min 등은 대입문을 통해 처음에 대입을 하므로 초기치 안씀
		int i, j;    // 메모리공간 절약?
		int min, max;
		int cnt = 0;   // 누적하는 용도이므로 초기치 0 설정
		int hap = 0;

		
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
		
		for(i=min; i<=max; i++) { //소수 계산 부분 시작
			for(j=2; j<i; j++) {
				if(i%j == 0)
					break;   // i변수의 값은 더이상 소수가 아님
			}
			if(i == j) {  //i변수의 값이 소수인 경우
				System.out.printf("%5d", i);  //소수 출력. %5d = 숫자 사이의 공백 의도
				cnt++;  //소수 갯수 카운트
				if(cnt % 10 == 0)  //한줄에 10개씩 출력
					System.out.println();
				hap += i;  // 소수의 합을 구함
			}
		} // 소수 계산 끝
		
		if(cnt % 10 != 0)
			System.out.println();
		
		System.out.println("총소수의 갯수 = " + cnt);
		System.out.println("총소수 합 = "+ hap);
		

	}

}
