
public class GradeEx1Teacher {
	final static int MAX = 100;
	public static void main(String[] args) {
		
		Grade obj1[] = new Grade[MAX];
		PersonInfo obj2[] = new PersonInfo[MAX];
		int i, obj1_cnt=0, obj2_cnt=0;
		
		
		System.out.println("\n\t\t *** 성적 입력 ***");  // \n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
		
			for(i=0; i<MAX; i++) {
				obj1[i] = new Grade();
				if(obj1[i].input())
					break;
				
				obj1[i].process();
				obj1_cnt++;
				System.out.println();
			}
			
				
			System.out.println("\n\t\t *** 개인정보 입력 ***");
			for(i=0; i<MAX; i++) {
				obj2[i] = new PersonInfo();
				if(obj2[i].input())
					break;
				obj2_cnt++;
				System.out.println();
			}
			System.out.println();
			System.out.println("\n \t \t *** 성적표 ***");
			System.out.println("===============================================");
			System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
			System.out.println("===============================================");
			printData(obj1, obj1_cnt);
			System.out.println("===============================================");
		
			
			System.out.println("\n                  *** 개인정보 ***");
			System.out.println("===============================================");
			System.out.println("학번              이름           전화번호           주소");
			System.out.println("===============================================");
			printData(obj2, obj2_cnt);
			System.out.println("===============================================");
			}
			
		
		static void printData(Personable obj[], int cnt) {
			for(int i=0; i<cnt; i++) {
				obj[i].output();	// output()메서드에 대한 다형성 구현
			}
		}
}
			
