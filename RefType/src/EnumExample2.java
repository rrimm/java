
public class EnumExample2 {

	public static void main(String[] args) {
		printDay("MONDAY");	
		printDay("WEDNESDAY");
		printDay("FRIDAY");

	}
	
	static void printDay(String name) {
		Day day = Day.valueOf(name);	// valueOf: 문자에 해당하는 열거상수값 반환하는 메소드
		System.out.println(day);
		}

}
