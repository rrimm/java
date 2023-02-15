package product;
public class SolSangpum1 {  	// 단점: 공간낭비
	static int MAX = 20;
	
	public static void main(String[] args) {
		
		Sangpum2 obj[] = new Sangpum2[MAX];
		
		
		int cnt = input(obj);
		output(obj, cnt);
	}
		
		static int input(Sangpum2 obj[]) {
			int i, cnt = 0;
			
		for(i=0; i<MAX; i++) {
			obj[i] = new Sangpum2();
			if(obj[i].input())
				break;
			
			obj[i].calculate();
			cnt++;
			System.out.println();
		}
		return cnt;
		}
		
		static void output(Sangpum2 obj[], int cnt) {
		System.out.println("\n\t\t *** 상품정보 ***");
		System.out.println("===============================================");
		System.out.println("상품코드" + "\t" + "상품명" + "\t" + "수량" + "\t" + "단가" + "\t" + "금액");
		System.out.println("===============================================");
		
		for(int i=0; i<cnt; i++) {
			
			obj[i].output();
		}
		System.out.println("===============================================");
		
		}
	

	
	
}
	
	

