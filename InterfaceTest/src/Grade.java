import java.util.Scanner;

public class Grade extends Person implements Personable {
	
	int kor, eng, math;  
	int tot; 
	double avg;   
	String grade;
	
	
	
	Grade() {
		
	}


	public boolean input() {			// 메서드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		if(hakbun.toLowerCase().equals("exit")) 	//equals 메소드를 사용하여 문자열 비교로 데이터를 더이상 입력하지 않고 빠져나옴 toLowerCase() - 학번에 저장된 문자열을 소문자로
			return true;
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어점수 입력 => ");
		kor = scan.nextInt();
		System.out.print("영어점수 입력 => ");
		eng = scan.nextInt();
		System.out.print("수학점수 입력 => ");
		math = scan.nextInt();
			return false;
		
	}
		
	
	void process() {
		
		
		tot = kor + eng + math;
		avg = tot / 3.;
		
		switch((int)avg / 10) { 		//캐스트 연산
		case 10:	//100점일 때
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
		case 6:
			grade = "양";
			default:
				grade = "가";
				break;
		}
		
		System.out.println();
		
}
		 	
	public void output() {

	System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %6.2f   %2s\n", hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
		
}

