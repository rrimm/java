

public class HashCodeExample1 {

	public static void main(String[] args) {
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");	// 객체 각각 생성
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();	// 각각의 객체에 대해 hashCode 메소드를 호출
		System.out.println(hash1);
		System.out.println(hash2);	// hashCode 메소드의 리턴 값을 출력

	}

}
