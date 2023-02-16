
public class HashCodeExample2 {

	public static void main(String[] args) {
		Name obj1 = new Name("헤르미온느", "그레인져");	// name클래스를 정의할 때 오브젝트클래스의 hashcode 그대로 사용했기에 각각의 객체가 생성될 때 레퍼런스 주소를 통해 계산하여 다른 hashcode값이 도출
		Name obj2 = new Name("헤르미온느", "그레인져");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);

	}

}
