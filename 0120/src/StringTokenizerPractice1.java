import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerPractice1 {
//	수식을 계산할 때 연산자 우선순위는 고려하지 않고 먼저 기술한 연산이 먼저 수행되도록 한다.
//	사칙연산 기준(+, -, *, /)
//	수식에 오류가 있는 경우 새로운 수식을 입력받는다.
//  숫자가 아닌걸 띄워도 수식 입력 오류 도출	
//	입출력형식
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = null;
		int result = 0;

		System.out.print("수식 입력 => ");
		str = scan.next();

		StringTokenizer stok = new StringTokenizer(str, "+*-/", true); // true: 연산자도 같이 출력

		while (stok.hasMoreTokens()) {
			String token = stok.nextToken();

			if (token.equals("+")) {
				token = stok.nextToken();
				result += Integer.parseInt(token);
			} else if (token.equals("-")) {
				token = stok.nextToken();
				result -= Integer.parseInt(token);
			} else if (!token.equals("*")) {
				token = stok.nextToken();
				result *= Integer.parseInt(token);
			} else if (!token.equals("/")) {
				token = stok.nextToken();
				result /= Integer.parseInt(token);
			} else
				result += Integer.parseInt(token); // 숫자면 문자열에서 숫자변환
		}

		System.out.println("결과:" + str + "=" + result);
	}
	
	
//	if (!token2.equals("+")) {
//		if(!token2.equals("-"))
//			if(!token2.equals("*"))
//				if(!token2.equals("/"))		//숫자라면
//					Integer.parseInt(token2);	//문자로 입력된 숫자를 수로 변환
//					System.out.print(token2);	
//	}

}
