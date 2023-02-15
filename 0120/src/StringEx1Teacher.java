import java.util.Scanner;

public class StringEx1Teacher {

	public static void main(String[] args) {
		int i, w=2, chk, hap=0;
		String ju; 	// 주민번호
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민번호 입력 => ");
			ju = scan.next();
			
			if(!input_check(ju)) {
				System.out.println("주민번호 입력 오류!!!");
				continue;
			}
			else
				break;
		}
		
		// 합 구하는 과정
		for(i=0; i<ju.length()-1; i++) {	//맨 마지막 자리를 제외하도록 1빼줌
			if(i==6)
				continue;
			
			hap += Integer.parseInt(ju.substring(i, i+1)) * w;	// w:가중치
			w++;
			if(w == 10)
				w=2;
		}
		
		chk = 11-hap%11;
		if(chk == 10)
			chk = 0;
		else if(chk == 11)
			chk = 1;		// 이렇게 도출된 값과 체크디지트 비교
				
		if(chk == Integer.parseInt(ju.substring(13, 14)))
			System.out.println("주민번호 : " + ju + "(O)");
		else
			System.out.println("주민번호 : " + ju + "(X)");
		
	}
	
	static boolean input_check(String str) { 	// 입력받은 주민번호가 숫자가 아니면 오류체크하고 
		char ch;
		
		if(str.length() != 14)		// 입력받은 문자열이 14자리인지 검사
			return false;
		
		for(int i=0; i<str.length(); i++) {		// 문자열을 전달받아 문자열 길이만큼 한문자씩 검사
			ch = str.charAt(i);		// 문자열에서 한문자씩 추출
			if(i==6) {	// '-'인지 검사
				if(ch != '-')
					return false;
			}
			else if(i == 7) {	// 성별 값 검사
				if(!(ch == '1' || ch == '2' || ch == '3' || ch == '4'))
					return false;
			}
			else if (ch < '0' || ch> '9')	// ch가 숫자인지 검사(유니코드로 비교)
				return false;
				
		}
		return true;
	}

}
