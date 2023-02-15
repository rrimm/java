import java.util.GregorianCalendar;

public class ObjectExample5 {

	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);	// Object 클래스의 equals 메소드를 오버라이딩하여 객체의 주소가 아닌 값을 비교하도록 함
		GregorianCalendar obj2 = new GregorianCalendar(2007, 0, 1);
		if (obj1.equals(obj2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}
