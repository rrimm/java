
public class HelloJava3 {

	public static void main(String[] args) {
		int num = 0;
		int a = num++; //변수의 값을 먼저 사용한 다음에 증가이므로 a = 0이 된 이후 num 증가
		System.out.println(a);
		System.out.println(num);
		int b = ++num;
		System.out.println(b);
		System.out.println(num);

	}

}
