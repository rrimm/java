
public class EnumExample1 {

	public static void main(String[] args) {
		Day days[] = Day.values();	// Day: 열거타입에 대한 클래스명. values는 열거타입값들을 배열형태로 저장
		for (Day day : days)
		System.out.println(day);

	}

}
