
public class S_Example1 {

	public static void main(String[] args) {
		System.out.println("1에서부터 100사이 숫자에서 홀수와 짝수의 합을 구해서 출력하는 프로그램을 작성하시오.");
		
				
				int odd = 0, even = 0;
				
				for(int num = 1; num <= 100; num++) {
					
					if ((num % 2) != 0) {
						odd += num;
					}
					else {
						even += num;
					}
					
				}
					System.out.println("1 부터 100 까지의 수 중에서 홀수의 합 : " + odd);
					System.out.println("1 부터 100 까지의 수 중에서 짝수의 합 : " + even);
		
		
		/*
		int num = 1; 
		int odd = 0, even = 0;
		
		while(num <= 100) {
			
			if ((num % 2) != 0) {
				odd += num;
			}
			else 
			even += num;
			
			num++;
		}
			System.out.println("1 부터 100 까지의 수 중에서 홀수의 합 : " + odd);
			System.out.println("1 부터 100 까지의 수 중에서 짝수의 합 : " + even);
			*/
	}

}
