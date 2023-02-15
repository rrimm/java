package grade;
public class GradeClassEx2 {
	static int MAX = 100;
	
	public static void main(String[] args) {
		
			GradeClass obj[] = new GradeClass[MAX];
			
			double tot_avg=0;
			
			int cnt = input_sungjuk(obj);
			output_sungjuk(obj, cnt);  // 파라미터와 cnt 모두 전달하므로
		
	}
	static int input_sungjuk(GradeClass obj[]) {
		int cnt = 0;
		for(int i=0; i<MAX; i++) {
			obj[i] = new GradeClass();
			if(obj[i].input())
				break;
			obj[i].process();
			cnt++;
			System.out.println();
		}
		return cnt;
		}
	
	static void output_sungjuk(GradeClass obj[], int cnt){
		
		
		double tot_avg=0;
		
		System.out.println("\n\t\t *** 성적표 ***");  // \n: 줄바꿈,  \t: 수평으로 \t 개수만큼 이동
		System.out.println("===============================================");
		System.out.println("학번    이름    국어   영어   수학   총점   평균   등급");
		System.out.println("===============================================");
		for(int i=0; i<cnt; i++) {
		obj[i].output();
		tot_avg += obj[i].avg;
		}
		System.out.println("===============================================");
		System.out.printf("\t 학생수 = %d, 전체평균 = %5.2f\n", cnt, tot_avg / cnt);
		}
}
