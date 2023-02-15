
public class ConditionalOpExample1 {

	public static void main(String[] args) {
		int a = 20, b = 30, max;
		max = a < b ? a : b;  //간단한 if문 대신 사용이 가능한 조건연산자
		/* if(a < b)
			max = a;
			else
			max = b; */
		System.out.println(max);

	}

}
