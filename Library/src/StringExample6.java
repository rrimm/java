
public class StringExample6 {

	public static void main(String[] args) {
		String str = "뇌를 자극하는 자바";
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
		for(int i=0; i<str.length(); i++)
			System.out.println(str.substring(i, i+1));
	}

}
