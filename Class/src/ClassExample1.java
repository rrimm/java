
public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj;				// 변수 선언
		obj = new GoodsStock("52135", 200);		// 객체 생성
		
//		obj.goodsCode = "52135";    // 필드에 값 대입
//		obj.stockNum = 200;			// 필드에 값 대입
		
		System.out.println("상품코드:" + obj.goodsCode); 	// 필드 값 사용
		System.out.println("재고수량:" + obj.stockNum);	// 필드 값 사용
		obj.addStock(1000); 							// 메소드 호출
		System.out.println("상품코드:" + obj.goodsCode);	// 필드 값 사용
		System.out.println("재고수량:" + obj.stockNum);	// 필드 값 사용
		
	}

}
