package primenumber;
import java.util.Scanner;

public class PrimeNumberEx2 {

	public static void main(String[] args) {
		
		int res[];  // main에서 배열타입의 레퍼런스 변수 만드는 과정
		
		res = input_num(); // 전달할 데이터가 없으므로 파라미터 생략. 겍체의 주소를 전달받고 지역변수의 val은 사라지고 객체만 남음
		int cnt = process_primenumber(res); //호출(반환값 cnt 있음)
		print_cnt(cnt); //호출
	}
		
		   // 메모리공간 절약?
		
		
		static int[] input_num() {  // 메인메소드에서 호출하게 될텐데, 호출당하는 메서드도 static을 만들어줘야 함
			
			int num1, num2;  // 메소드 내부에서 변수 만듦
			int val[] = new int[2];  //작은수와 큰수를 저장할 배열 변수를 만들어줌. 
			// java에서는 return 시 하나의 값만 할 수 있으므로 val 배열로 여러값을 반환할 수 있게 함.
			// 정수형 데이터와 실수형 데이터 여러 개를 전달하고 싶을 경우, 서로다른 데이터를 처리할 수 있는 자료구조를 이용하거나 클래스를 만들고 객체를 만들어서 데이터를 넣어 처리할 수 있음
			int i, j;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 숫자 입력 => ");
			num1 = scan.nextInt();
			System.out.print("두번째 숫자 입력 => ");
			num2 = scan.nextInt();
			System.out.println();
			
			if(num1 < num2) {  // 큰 수와 작은 수 구하는 부분
				val[0] = num1;
				val[1] = num2;
			}
			else {
				val[0] = num2;
				val[1] = num1;
			}
			return val;  // val이 가지고 있는 배열의 주소를 input_num() 메서드로 전달 -> 위로 올라가서 메인메서드에서 res[]가 주소를 전달받음
		}
	
		
		
		
		static int process_primenumber(int val[]) { //val은 정수형 객체의 주소를 정할 수 있는 레퍼런스 변수
			int i, j;
			int cnt = 0; 
		//	int hap = 0;
			
			
		for(i = val[0]; i <= val[1] ; i++) { //소수 계산 부분 시작
			
			for(j=2; j<i; j++) {
				if(i%j == 0)
					break;   // i변수의 값은 더이상 소수가 아님
			}
			if(i == j) {  //i변수의 값이 소수인 경우
				System.out.printf("%5d", i);  //소수 출력. %5d = 숫자 사이의 공백 의도
				cnt++;  //소수 갯수 카운트
				if(cnt % 10 == 0)  //한줄에 10개씩 출력
					System.out.println();
			//	hap += i;  // 소수의 합을 구함
				}
			} // 소수 계산 끝
		return cnt;
		
		}
		
		
		static void print_cnt(int cnt) {
			
			
		if(cnt % 10 != 0)
			System.out.println();
		
		System.out.println("총소수의 갯수 = " + cnt);
		// System.out.println("총소수 합 = "+ hap);
		
		}
}
	

	


