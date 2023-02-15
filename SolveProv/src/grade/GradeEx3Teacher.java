package grade;
import java.util.Scanner;

public class GradeEx3Teacher {

		static int MAX = 100;	 	// 필드 설정. 배열의 크기를 변경하고 싶을 때 필드값만 변경하면 되므로 쉽게 수정이나 유지보수 가능
		public static void main(String[] args) {
					
					String hakbun[] = new String[MAX]; 
					String irum[] = new String[MAX];
					int kor[] = new int[MAX];
					int eng[] = new int[MAX];
					int math[] = new int[MAX];
					int tot[] = new int[MAX];
					double avg[] = new double[MAX];
					String grade[] = new String[MAX]; 	//이런 데이터를 다룰 수 있는 클래스를 설계하여 데이터를 더 정리해야 함
					
					int cnt = 0;
					
					
					cnt = input_sungjuk(hakbun, irum, kor, eng, math, tot, avg, grade); //실제 입력받은 데이터 정보 개수를 가진 cnt
					output_sungjuk(hakbun, irum, kor, eng, math, tot, avg, grade, cnt); //데이터 주소
					
					
					
				}
				
		static int input_sungjuk(String hakbun[], String irum[], int kor[], int eng[],  // int는 cnt와 동일한 타입으로 선언
				int math[], int tot[], double avg[], String grade[]) {	//전달받는 파라미터 입력
			int cnt = 0; 
			int i;
			
			Scanner scan = new Scanner(System.in);
			
			for(i = 0; i < MAX; i++) {
			System.out.print("학번 입력 => ");
			hakbun[i] = scan.next();
			if(hakbun[i].equals("exit")) 	//equals 메소드를 사용하여 문자열 비교로 데이터를 더이상 입력하지 않고 빠져나옴
			break;
			System.out.print("이름 입력 => ");
			irum[i] = scan.next();
			while(true) {
			try {
				System.out.print("국어점수 입력 => ");
				kor[i] = scan.nextInt(); 
			}
			catch(Exception e) {
					System.out.println("국어점수 입력 오류!!!" + e.getMessage());

					if(scan.hasNext())	// 방법2: 버퍼로부터 읽을 데이터가 있는지 체크. 있으면 true 없으면 false 반환
						scan.next();   // 버퍼를 비워주는 방법
					continue;
				}
				break;
			}
			
			System.out.print("수학점수 입력 => ");
			eng[i] = scan.nextInt();
			System.out.print("영어점수 입력 => ");
			math[i] = scan.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.;
			
			switch((int)avg[i] / 10) { 		//캐스트 연산
			case 10:	//100점일 때
			case 9:
				grade[i] = "수";
				break;
			case 8:
				grade[i] = "우";
				break;
			case 7:
				grade[i] = "미";
			case 6:
				grade[i] = "양";
				default:
					grade[i] = "가";
					break;
			}
			cnt++;
			System.out.println();
			}
			return cnt;
		}
		
		static void output_sungjuk(String hakbun[], String irum[], int kor[], int eng[],  
				int math[], int tot[], double avg[], String grade[], int cnt) {
			
			int i; 
			double avg_hap = 0;
			
			System.out.println("\n\t\t *** 성적표 ***");  // \n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
			System.out.println("===============================================");
			System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
			System.out.println("===============================================");
			
				for(i = 0; i<cnt; i++) {
					avg_hap += avg[i];
			System.out.printf("%4s   %3s   %3d   %3d   %3d   %3d   %6.2f   %2s\n", hakbun[i], irum[i], kor[i], eng[i], math[i], tot[i], avg[i], grade[i]);
			}
			System.out.println("===============================================");
			System.out.printf("\t 학생수 = %d, 전체평균 = %5.2f\n", cnt, avg_hap / cnt);
			
		}
	}
		

