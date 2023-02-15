package product;

public class So1Constructor1 {

	public static void main(String[] args) {
		System.out.println("상품(Sangpum)클래스를 이용하여 객체를 "
				+ "만든다음 그 객체를 이용하여 상품정보를 입력받은 후 출력하는 프로그램을 작성하시오.");
/* 상품(Sangpum)클래스 구조
		필드: 상품코드, 상품명, 수량, 단가, 금액
		메서드: 상품입력(), 단가계산(), 상품출력()  */
		
		Sangpum obj = new Sangpum();
		
		obj.input();
		obj.calculate();
		
		
	System.out.println("\n\t\t *** 상품정보 ***");
	System.out.println("===============================================");
	System.out.println("상품코드" + "\t" + "상품명" + "\t" + "수량" + "\t" + "단가" + "\t" + "금액");
	System.out.println("===============================================");
	obj.output();
	System.out.println("===============================================");
	
	
	}
}
		
	

		
	


