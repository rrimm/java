
public class ConditionalOrExample1 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		
		if (++num1 > 0 || ++num2 > 0) //num1을 수행했을 때 1이 되어 true가 되므로 num2쪽을 수행하지 않아 결과적으로 출력값은 num2=0이 된다.(short circuit)
		System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}

}
