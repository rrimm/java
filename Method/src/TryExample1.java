
public class TryExample1 {

	public static void main(String[] args) {
		
		int divisor[] = { 5, 4, 3, 2, 1, 0 };
		
		for (int cnt = 0; cnt < 10; cnt++) {
			try { 
				int share = 100 / divisor[cnt]; 
				System.out.println(share); 
			} 
			catch (java.lang.ArithmeticException e) { // java.lang.ArithmeticException에서 발생된 객체를 e가 전달받음 
				System.out.println("잘못된 연산입니다. =>" + e.getMessage()); 
				} 
			catch (java.lang.ArrayIndexOutOfBoundsException e) { 
				System.out.println("잘못된 인덱스입니다. =>"+ e.getMessage()); 
				} 
			catch (java.lang.Exception e) { /*클래스에는 부모 클래스 존재. Exception이 부모클래스로서 위의 ArithmeticException, ArrayIndexOutOfBoundsException는 exception 클래스를 상속받은 하위 클래스이므로 Exception클래스로 한 번에 예외처리 가능
				 그런데도 예외 객체를 각자 정하는 이유는 어떤 오류가 발생했는지를 알기 위해서
				예외 클래스타입을 기술할 때 부모클래스를 먼저 기술하면 하위클래스를 만나지 못하므로 부모클래스 타입은 마지막에 기술. */
				System.out.println("잘못된 인덱스입니다. =>"+ e.getMessage()); 
				} 
			} 
			System.out.println("Done.");

	}

}
