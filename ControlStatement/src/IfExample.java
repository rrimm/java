import java.util.Scanner; // ctrl + shift + o

public class IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner는 데이터를 입력받을 수 있는 클래스. in은 표준입력으로서 키보드 뜻. new가 나오면 객체가 만들어지는 것이라고 이해하기
		int jumsu;
		
		
		System.out.print("점수 입력 => ");
		jumsu = scan.nextInt(); //입력받은 데이터를 정수로 변환하여 return시켜주고 jumsu에 저장됨. 문자형 데이터를 입력할 때는 그냥 next를 입력. 문제가 발생시 예외처리를 활용하는 방법도 있음
		
		if (jumsu >= 90)
		System.out.println("수");
		else if (jumsu >= 80)
				System.out.println("우");
			else if (jumsu >= 70)
				System.out.println("미");
					else if (jumsu >= 60)
						System.out.println("양");
						else
							System.out.println("가");


	}

}
