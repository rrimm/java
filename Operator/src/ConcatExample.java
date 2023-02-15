
public class ConcatExample {   // +의 처리순서 확인

	public static void main(String[] args) {
		String str1 = "num=" + 3 + 4;
		String str2 = 3 + 4 + "=num";
		System.out.println(str1);
		System.out.println(str2);

	}

}
