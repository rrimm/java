package grade;
import java.util.Scanner;

public class GradeEx3 {		// 배열을 활용하여 성적을 구하는 실습
		
		public static void main(String[] args) {
			// 학번, 이름, 국어 등 다 3개저장하도록 배열 만들어야 함
			//그리고 성적 입력하는 거 3번 반복
			//점수 3번 출력
			String hak_irum[] = scan_hak_irum();
			int study[] = scan_study();
			
			int i = 0;
			
			if(i == 0) {
				scan_hak_irum();
				scan_study();
			i++;
			}
			if(i == 1) {
				scan_hak_irum();
				scan_study();
			i++;
			}
			if(i == 2) {
				scan_hak_irum();
				scan_study();
			
			}
			
			
			
			
			System.out.println("\n\t\t *** 성적표 ***");  //\n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
			System.out.println("===============================================");
			System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
			System.out.println("===============================================");
			
			for(int j = 0; j<9;j++) {
				if(j%3 == 0 | j == 0) {
				int tot = study[j] + study[j+1] + study[j+2];
				int avg = tot / 3;
				
				
				String grade; 
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
				
			System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %3d   %s\n", hak_irum[j], hak_irum[j+1], study[j], study[j+1], study[j+2], tot, avg, grade);
			}
			}
			System.out.println("===============================================");
			
		
		

		}
		
		 static String[] scan_hak_irum() {
			 
			 String hak_irum[] = new String[6]; // 학번1, 이름1, 학번2, 이름2, 학번3, 이름3
				
				Scanner scan = new Scanner(System.in);
			 int i = 0;
				
				if(i == 0) {
			 System.out.print("학번 입력 => ");
			 hak_irum[0] = scan.next();
				System.out.print("이름 입력 => ");
				hak_irum[1] = scan.next();
				}
				i++;
				
				if(i == 1) {
					System.out.print("학번 입력 => ");
					hak_irum[2] = scan.next();
					System.out.print("이름 입력 => ");
					hak_irum[3] = scan.next();
				}
				i++;
				
				if(i == 2) {
					System.out.print("학번 입력 => ");
					hak_irum[4] = scan.next();
					System.out.print("이름 입력 => ");
					hak_irum[5] = scan.next();
				}
				
			 return hak_irum;

	}
		 static int[] scan_study() {
			 
			 
				int study[] = new int[9];
				int i = 0;
				
				Scanner scan = new Scanner(System.in);
			 
				if(i == 0) {
					System.out.print("국어점수 입력 => ");
					study[0] = scan.nextInt();
					System.out.print("수학점수 입력 => ");
					study[1] = scan.nextInt();
					System.out.print("영어점수 입력 => ");
					study[2] = scan.nextInt();
						}
						i++;
						
				if(i == 1) {
					System.out.print("국어점수 입력 => ");
					study[3] = scan.nextInt();
					System.out.print("수학점수 입력 => ");
					study[4] = scan.nextInt();
					System.out.print("영어점수 입력 => ");
					study[5] = scan.nextInt();
						}
					i++;
				if(i == 1) {
					System.out.print("국어점수 입력 => ");
					study[6] = scan.nextInt();
					System.out.print("수학점수 입력 => ");
					study[7] = scan.nextInt();
					System.out.print("영어점수 입력 => ");
					study[8] = scan.nextInt();
						}
					i++;	
			 
				return study;

	} 
		 

}
