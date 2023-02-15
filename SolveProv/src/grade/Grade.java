package grade;
import java.util.Scanner;

public class Grade {
	String hak, irum;
	int kor, eng, math;  
	int tot; 
	double avg;   
	String grade;  			// 필드
	
	
	public Grade() { 		// 생성자
	}
	
	void input() {			// 메서드
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번 입력 => ");
		this.hak = scan.next();
		System.out.println("이름 입력 => ");
		this.irum = scan.next();
		System.out.println("국어 입력 => ");
		this.kor = scan.nextInt();
		System.out.println("영어 입력 => ");
		this.eng = scan.nextInt();
		System.out.println("수학 입력 => ");
		this.math = scan.nextInt();
		
	}
		
	
	void calculate() {
		
		tot = kor + eng + math;
		avg = tot / 3.;
		
/*		if(avg >= 90)
			grade = "수";
		else if(avg >= 80)
			grade = "우";
		else if(avg >= 70)
			grade = "미";
		else if(avg >= 60)
			grade = "양";
		else
			grade = "가"; 
*/			
		 switch((int)avg / 10) {
			 case 10: 
				 grade = "수";
			 case 9:
				 grade = "우";
				 break;
			 case 8:
				 grade = "미";
				 break;
			 case 7:
				 grade = "양";
				 break;
				 default: 
					 grade = "가";
					 break;
		 	}
		 }
		 
		
	void output() {
		
	System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %5.2f   %2s\n", hak, irum, kor, eng, math, tot, avg, grade);
		
	}
}
