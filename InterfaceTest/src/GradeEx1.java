
public class GradeEx1 {
	static int MAX =30;
	public static void main(String[] args) {
		int i;
		int obj1_cnt=0;
		int obj2_cnt=0;
		
		Grade obj1[] = new Grade[MAX];
		PersonInfo obj2[] = new PersonInfo[MAX];
		
		obj1_cnt = input_sungjuk(obj1, obj1_cnt);
		output_sungjuk(obj1, obj1_cnt);
		obj2_cnt = input_PersonInfo(obj2, obj2_cnt);
		output_PersonInfo(obj2, obj2_cnt);
		
	}
	
		static int input_sungjuk(Grade obj1[], int obj1_cnt) {
			
			for(int i=0; i<MAX; i++) {
				obj1[i] = new Grade();
				if(obj1[i].input())
					break;
				obj1[i].process();
				obj1_cnt++;
				System.out.println();
			}
			return obj1_cnt;
				
				
			}
		
		public static void output_sungjuk(Grade obj1[], int obj1_cnt) {
			System.out.println("\n\t\t *** 성적표 ***");  // \n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
			System.out.println("===============================================");
			System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
			System.out.println("===============================================");
			for(int j=0; j<obj1_cnt; j++) {
			obj1[j].output();
			
			}
			System.out.println("===============================================");
		}
		
		static int input_PersonInfo(PersonInfo obj2[], int obj2_cnt) {
			
			for(int i=0; i<MAX; i++) {
				obj2[i] = new PersonInfo();
				if(obj2[i].input())
					break;
				obj2_cnt++;
				System.out.println();
			}
			return obj2_cnt;
				
			}
		
		public static void output_PersonInfo(Personable obj2[], int obj2_cnt) {
			System.out.println("\n\t\t *** 개인정보 ***");  // \n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
			System.out.println("===============================================");
			System.out.println("학번    이름    전화번호   주소");
			System.out.println("===============================================");
			for(int i=0; i<obj2_cnt; i++) {
			obj2[i].output();
			
			}
			System.out.println("===============================================");
		}
}
			
			
	
		
		


	


