
public class ObjectExample4 {

	public static void main(String[] args) {
		Sungjuk obj1 = new Sungjuk();
//		Sungjuk obj2 = new Sungjuk();
		obj1.input();
		obj1.process();
//		obj2.input();
//		obj2.process();
		System.out.println();
		Sungjuk obj2 = (Sungjuk) obj1.clone();
		if (obj1.equals(obj2)) {	// Object 클래스의 equals 메소드는 객체의 주소를 비교
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		System.out.println();
		System.out.println(obj1);
	}

}
