package gugudan;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		
		int res[];  // main에서 배열타입의 레퍼런스 변수 만드는 과정
		res = input_num(); // 전달할 데이터가 없으므로 파라미터 생략. 겍체의 주소를 전달받고 지역변수의 val은 사라지고 객체만 남음
		dan_title(res); //호출
		dan_print(res); //호출
	
		
	}
	
		
		
		static int[] input_num() {
		Scanner scan = new Scanner(System.in);
		int num1, num2;  // 메소드 내부에서 변수 만듦
		int val[] = new int[2];  //작은수와 큰수를 저장할 배열 변수를 만들어줌. 
		// java에서는 return 시 하나의 값만 할 수 있으므로 val 배열로 여러값을 반환할 수 있게 함.
		// 정수형 데이터와 실수형 데이터 여러 개를 전달하고 싶을 경우, 서로다른 데이터를 처리할 수 있는 자료구조를 이용하거나 클래스를 만들고 객체를 만들어서 데이터를 넣어 처리할 수 있음
		
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
		return val;  // val이 가지고 있는 배열의 주소를 input_num() 메서드로 전달 -> 위로 올라가서 res[]가 주소를 전달받음
	}
		
		static void dan_title(int val[]) { // dan_title이라는 메서드에서 val 변수가 배열의 주소 전달
			
			for(int i = val[0]; i <= val[1] ; i++) {
				
				System.out.print("*** "+ i +"단 ***  ");
				
				}
				
				System.out.println();
				
		}
		
		static void dan_print(int val[]) {
			
			for(int j = 1; j < 10; j++ ) {
				for(int i = val[0]; i <= val[1]; i++) {
				System.out.printf("%d * %d = %d   ", i, j, i*j);
				}
				System.out.println();
			}
			
		}
		
}
			
	
	