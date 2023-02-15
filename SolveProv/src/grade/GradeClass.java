package grade;
import java.util.Scanner;

public class GradeClass {
/*	처리조건
	최대 100명까지 입력이 가능하도록 한다.
	학번에 exit을 입력하면 입력을 끝내고 입력받은 전체 데이터를 출력한다.
	마지막으로 총 학생수와 전체 평균을 구해서 출력한다.	*/
	
	
			//메서드
	String hak, irum;
	int kor, eng, math;  
	int tot; 
	double avg;   
	String grade;
	int cnt = 0;
	
	
	public GradeClass() { 		// 생성자
	}
	
	
	
	boolean input() {			// 메서드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hak = scan.next();
		if(hak.equals("exit")) 	//equals 메소드를 사용하여 문자열 비교로 데이터를 더이상 입력하지 않고 빠져나옴
			return true;
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어점수 입력 => ");
		kor = scan.nextInt();
		System.out.print("수학점수 입력 => ");
		eng = scan.nextInt();
		System.out.print("영어점수 입력 => ");
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
		cnt++;
		System.out.println();
		
}
		 
		
	void output() {
	
	int i; 
	double avg_hap = 0;
	
	for(i = 0; i<cnt; i++) {
		avg_hap += avg;
System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %6.2f   %2s\n", hak, irum, kor, eng, math, tot, avg, grade);
}
	
		
	
	
}
	
	}
