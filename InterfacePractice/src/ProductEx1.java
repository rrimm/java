
public class ProductEx1 {
	static int MAX = 100;
	public static void main(String[] args) {
		System.out.println("상품(Sangpum)클래스를 이용하여 객체를 "
			+ "만든다음 그 객체를 이용하여 상품정보를 입력받은 후 출력하는 프로그램을 작성하시오.");
		
		int cnt=0;
		Product obj[] = new Product[MAX];
		
		
		cnt = print_sangpum(obj, cnt);
		
		System.out.println("\n \t \t ***상품정보***");
		System.out.println("===============================================");
		System.out.println("상품코드   상품명    수량   단가   금액");
		System.out.println("===============================================");
		print_out(obj, cnt);
		System.out.println("===============================================");
	}
	
	static int print_sangpum(Product obj[], int cnt){
		for(int i = 0; i<MAX; i++) {
			obj[i] = new Product();
			
			if(obj[i].input())
				break;
			
			obj[i].process();
			cnt++;
		}
		return cnt;
	}
	
	static void print_out(InputOutput obj[], int cnt){
		
		for(int i = 0; i<cnt; i++) {
			obj[i].output();
			}
	}
	
	
}
