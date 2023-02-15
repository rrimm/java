package grade;
import java.util.Scanner;

public class GradeEx2 {

	public static void main(String[] args) {
		// 학번, 이름, 국어 등 다 3개저장하도록 배열 만들어야 함
		//그리고 성적 입력하는 거 3번 반복
		//점수 3번 출력
		
		
		
		String hak[] = new String[3]; 
		String irum[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int tot[] = new int[3];
		int avg[] = new int[3];
		
		
		String grade;    // 변수 선언. 모두 지역변수(String은 클래스)
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
		System.out.print("학번 입력 => ");
		hak[i] = scan.next();
		System.out.print("이름 입력 => ");
		irum[i] = scan.next();
		System.out.print("국어점수 입력 => ");
		kor[i] = scan.nextInt();
		System.out.print("수학점수 입력 => ");
		eng[i] = scan.nextInt();
		System.out.print("영어점수 입력 => ");
		math[i] = scan.nextInt();
		
		System.out.println();
		}
		
		
		
		System.out.println("\n\t\t *** 성적표 ***");  //\n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
		System.out.println("===============================================");
		System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
		System.out.println("===============================================");
		
		for(int i=0; i<eng.length;i++) {
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3;
			
			if(avg[i] >= 90)
				grade = "수";
			else if(avg[i] >= 80)
				grade = "우";
			else if(avg[i] >= 70)
				grade = "미";
			else if(avg[i] >= 60)
				grade = "양";
			else
				grade = "가";
			
		System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %3d   %s\n", hak[i], irum[i], kor[i], eng[i], math[i], tot[i], avg[i], grade);
		}
		System.out.println("===============================================");
		
	
	

	}
	
	

}
