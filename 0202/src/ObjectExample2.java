
public class ObjectExample2 {

	public static void main(String[] args) {
		GoodsStock obj = new GoodsStock("57293", 100);
		String str = obj.toString();	// object 클래스가 정하고 있는 출력값: getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(str);
		System.out.println(obj);
		System.out.println(obj + " => 테스트");	// obj와 " => 테스트" 모두 toString()이 자동생략된 문자열이므로 연결되어 출력

	}

}
