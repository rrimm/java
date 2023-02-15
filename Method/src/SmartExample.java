
public class SmartExample {

	public static void main(String[] args) {
		int a = 3, b = 0;
		int result;
		try {
			result = a / b;  // 예외가 발생할 가능성이 있는 문장. 0으로 나누고 예외가 발생했을 때 객체 생성
			System.out.println(result);
		}
			catch (java.lang.ArithmeticException r) { // 예외가 발생했을 때 적절한 대처.ArithmeticException는 자바가 정해주는 클래스이며, 자바에 에러내용이 저장되어있음
			System.out.println("잘못된 연산입니다. =>" + r.getMessage()); // getMessage: 에러메시지 출력
		}
			finally {
			System.out.println("Done.");
		}

	}

}
