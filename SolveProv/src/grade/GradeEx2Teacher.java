package grade;
import java.util.Scanner;

public class GradeEx2Teacher {
	static int MAX = 100;	 	// 필드 설정. 배열의 크기를 변경하고 싶을 때 필드값만 변경하면 되므로 쉽게 수정이나 유지보수 가능
	public static void main(String[] args) {
				
				String hakbun[] = new String[MAX]; 
				String irum[] = new String[MAX];
				int kor[] = new int[MAX];
				int eng[] = new int[MAX];
				int math[] = new int[MAX];
				int tot[] = new int[MAX];
				double avg[] = new double[MAX];
				String grade[] = new String[MAX];
				int i;
				int cnt = 0;
				double avg_hap = 0;	
				
				
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
//	방법1:				scan = new Scanner(System.in); //버퍼가 생긴 오류를 방지하기 위해 새롭게 입력
						//정상적으로 작동할 때 내부적 구조: 엔터키를 치는 순간 버퍼로 전송되어 버퍼에 저장되고 데이터가 정상적으로 처리되면 버퍼가 지워지는 구조. 오류가 발생하면 버퍼를 비우지 못함. 
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
