
public class WrapperExample4 {	// 자동 Unboxing이 일어나는 경우

	public static void main(String[] args) {
		Integer obj = new Integer("10");
		int sum = obj + 20;		// Integer 객체와 int 타입의 값을 더하는 명령문	obj가 언박싱되어 int형으로 전환
		System.out.println(sum);
		
	}

}
