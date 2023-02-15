
public class LiteralExample6 {

	public static void main(String[] args) {
		char arr[] = { '뇌', '를', ' ', '\uC790', '\uADF9', '하',
				'는', '\n', 'J', 'a', '\166', '\141' };
				
		for (char ch : arr)
				System.out.print(ch);

	}

}
