
public class ObjectExample8 {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(10, 20);
		Rectangle obj2 = (Rectangle) obj1.clone();	// 동일한 객체를 하나 더 만들고 싶을 때
		System.out.println("obj1 = " + obj1.width + "x" + obj1.height);
		System.out.println("obj2 = " + obj2.width + "x" + obj2.height);

	}

}
