
public class BitsExample1 {

	public static void main(String[] args) {
		int num1 = 0xFFFF0000;
		int num2 = 0xFF00FF00;
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		int result3 = num1 ^ num2;
		int result4 = ~num1;
		System.out.printf("%08X %n", result1);
		System.out.printf("%08X %n", result2);
		System.out.printf("%08X %n", result3);
		System.out.printf("%08X %n", result4);

	}

}
