
public class SwitchExample1 {

	public static void main(String[] args) {
		int num = 2;
		switch (num) {
			case 1 :   // case 뒤에 오는 데이터는 정수형, 실수형, 문자형 데이터까지 가능
				System.out.println("Good Morning, Java");
				break;
			case 2 :
				System.out.println("Good Afternoon, Java");
				break;
			case 3 :
				System.out.println("Good Evening, Java");
				break;
			default :
				System.out.println("Hello, Java");
				break;  //마지막 break는 있어도 되고 없어도 됨
		}
		System.out.println("Done.");

	}

}
