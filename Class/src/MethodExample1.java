
public class MethodExample1 {

	public static void main(String[] args) {
		printCharacter('*', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		}
		static void printCharacter(char ch, int num) {  // 메인 메서드에는 무조건 static 키워드가 붙어야 하고, 정적 메서드라고 부른다.
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
		return;

	}

}
