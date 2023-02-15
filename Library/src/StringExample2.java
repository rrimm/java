
public class StringExample2 {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		
//		if (str1.equals(str2)) 	// 값 비교
		if (str1 == str2) 	// 객체의 주소가 같은지를 비교
		System.out.println("같음");
		else
		System.out.println("다름");

	}

}
