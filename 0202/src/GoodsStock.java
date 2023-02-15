
public class GoodsStock {
	String goodsCode; // 상품코드
	int stockNum; // 재고수량

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	/**
	 * overriding
	 */
	public String toString() {	// ObjectExample2에서 의도하는 대로 사용하고자 오버라이딩
		String str = "상품코드:" + goodsCode + " 재고수량:" + stockNum;
		return str;
	}
}
