
public class WrapperExample1 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		Integer obj3 = 7;	// 바로 대입되는 것이 아닌 객체를 만들고 obj2가 그 객체의 주소를 가리킴
		int sum = obj1.intValue() + obj2.intValue();
		int sum2 = obj3.intValue();
		System.out.println(sum);
		System.out.println(sum2);

	}

}
