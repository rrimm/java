
public class GoodsStock {
	String goodsCode;
	int stockNum;  // 재고수량      필드 초기화 목적
	
	
	GoodsStock(String code, int num) {
		goodsCode = code;
		stockNum = num; 		// 파라미터가 생성되어있는 생성자를 명시적으로 작성한 경우 default 생성자가 만들어지지 않는다.
//다른방법		this.goodsCode = goodsCode; //this는 생성된 객체 자신을 가리킴
//		this.stockNum = stockNum;
	
	}
	
	GoodsStock(){		// 파라미터가 구분되는 등 식별 가능. 생성자 오버로딩(overloading) = 동일한 이름의 생성자를 여러개 만드는 행위. 
		// 				메소드의 경우 method overloading. 여러개를 구별하는 기준은 파라미터가 된다. 
			
		}
	
	
	void addStock(int amount) {
		stockNum += amount;    // 수량을 입력받으면 수량만큼 누적
	}
	int subtractStock(int amount) {
		if (stockNum < amount)   //재고 계산: 수량만큼 재고에서 빼주고 뺀 수량을 반환값으로 전달
			return 0;
		stockNum -= amount;
		return amount;
	}
}
