import java.util.GregorianCalendar;

public class ObjectExample7 {

	public static void main(String[] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		if (obj1.equals(obj2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
