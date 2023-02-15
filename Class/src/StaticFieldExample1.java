
public class StaticFieldExample1 {

	public static void main(String[] args) {
		Accumulator obj1 = new Accumulator(); 
		Accumulator obj2 = new Accumulator(); 
		obj1.accumulate(10); 
		obj2.accumulate(20); 
		
		System.out.println("obj1.total = " + obj1.total); 
		System.out.println("obj1.grandTotal = " + obj1.grandTotal); 
		System.out.println("obj2.total = " + obj2.total); 
		System.out.println("obj2.grandTotal = " + obj2.grandTotal); 
		System.out.println("obj1.grandTotal = " + Accumulator.grandTotal); 	// 정적필드는 객체필드로 접근하는 것보단 클래스이름으로 접근하는 게 올바른 사용법
		}

}
