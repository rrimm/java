import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력받아 올바른 주민번호인지 아닌지 체크해서 출력하는 프로그램을 작성하시오.");

		/*		<입력 형식>
		주민번호 입력 => 123456 - 1234563
		
		<출력 형식>
		주민번호 : 123456 - 1234563(o)	
		
		Integer.parseInt(“1”) => 1
		
		입력받은 내용이 숫자로만 구성되어있는지도 고려*/
		
		
//		System.out.println(str);
//		System.out.println(str.substring(0,1));
//		System.out.println(str.length());
		int chk[] = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		String str = null; // 주민번호 입력받기

		
		Scanner scan = new Scanner(System.in);

		System.out.print("주민번호 입력 => ");
		str = scan.next();

		
		str = str.replace("-", "");
		

		for (int i = 0; i < str.length(); i++) {

			sum += Integer.parseInt(str.substring(i, i + 1)) * chk[i];

		}

		int val = 11 - sum % 11;

		if (sum % 11 == 0) {
			val = 1;
		} else {
			val = 0;
		}
		

		if (val == Integer.parseInt(str.substring(10, 11)))
			System.out.println("true");
		else
			System.out.println("false");

	}
	
		
		
		
		
//		if( str.length() != 11) {
//			System.out.println("주민번호 다시 입력하쇼");
//		}
		
//			sum += Integer.parseInt(str.charAt(i)*chk[i])); 
//		
//		System.out.println(Integer.parseInt(str.charAt(0)));
//		
////		str[i] = str.charAt(i);
//		
////		if(str.chatAt(0) == 1) {
////			
////		}
//		
//			// 주민등록번호 수 하나씩 추출한 값 * 가중치
//		
//		}
//		
//		int num = 11 - sum%11;
//		
//		if(sum%11 == 0)
//			return "O";
//		if(sum%11 == 1)
//			return "X";
//		
////		if(num == Integer.parseInt(str.charAt(i))
		
		
	

	}


