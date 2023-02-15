package grade;
import java.util.Scanner;

public class GradeEx1 {

	public static void main(String[] args) {
		String hakbun, irum;
		int kor, eng, math, tot;
		double avg;
		String grade;    // 변수 선언. 모두 지역변수(String은 클래스)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어점수 입력 => ");
		kor = scan.nextInt();
		System.out.print("수학점수 입력 => ");
		eng = scan.nextInt();
		System.out.print("영어점수 입력 => ");
		math = scan.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.;  // tot는 int형, 3에 .을 찍음으로써 실수형인 double형으로 만들 수 있음
		
		if(avg >= 90)
			grade = "수";
		else if(avg >= 80)
			grade = "우";
		else if(avg >= 70)
			grade = "미";
		else if(avg >= 60)
			grade = "양";
		else
			grade = "가";
		
		System.out.println("\n\t\t *** 성적표 ***");  //\n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
		System.out.println("===============================================");
		System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
		System.out.println("===============================================");
		System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %5.2f   %2s\n", hakbun, irum, kor, eng, math, tot, avg, grade);
		System.out.println("===============================================");
		
	
	}

}
