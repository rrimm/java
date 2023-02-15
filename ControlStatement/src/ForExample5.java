
public class ForExample5 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; // 배열 객체를 저장할 변수를 만듦
		int tot = 0;
		
		for (int val : arr) {  //arr의 위치에 배열이 와야 함. 배열이 가진 데이터의 개수만큼만 반복. arr배열의 데이터가 val에 저장
			tot += val;  // val에 arr의 데이터 누적, 반복
			
		}
		System.out.println(tot);
		System.out.println("Done.");

	}

}
