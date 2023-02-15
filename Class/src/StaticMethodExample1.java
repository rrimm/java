
public class StaticMethodExample1 {		// Accumulator2 클래스 가져옴

	public static void main(String[] args) {
		Accumulator2 obj1 = new Accumulator2(); 
		Accumulator2 obj2 = new Accumulator2(); 
		obj1.accumulate(10); 
		obj2.accumulate(20); 
		int grandTotal = Accumulator2.getGrandTotal(); 	// 정적 메소드 호출
		
		System.out.println("obj1.total = " + obj1.total); 
		System.out.println("obj2.total = " + obj2.total); 
		System.out.println("총계 = " + grandTotal);

	}

}
