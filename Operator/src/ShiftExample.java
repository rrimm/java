
public class ShiftExample {

	public static void main(String[] args) {
		int num = 0xFF00FF01;     // 11111111 00000000 11111111 00000001
		int result1 = num << 3;   // 11111000 00000111 11111000 00001000
		int result2 = num >> 3;   // 11111111 11100000 00011111 11100000
		int result3 = num >>> 3;  // 00011111 11100000 00011111 11100000
		System.out.printf("%08X %n", result1);
		System.out.printf("%08X %n", result2);
		System.out.printf("%08X %n", result3);

	}

}
