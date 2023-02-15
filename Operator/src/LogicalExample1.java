
public class LogicalExample1 {

	public static void main(String[] args) {
		int a = 3, b =4, c =3, d =5;
		if ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) // 연산자의 우선순위 생각. 산술>비교>논리
		System.out.println("맞습니다. ^0^");
		else
		System.out.println("아닌데요. OTL");

	}

}
