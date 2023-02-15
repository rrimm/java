
public class Numbers {
	int num[];
	Numbers(int num[]) { 	// 생성자
	this.num = num;
	}
	
	int getTotal() { 		// 배열의 합계를 구하는 메소드
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
		total += num[cnt];
		return total;
	}
	int getAverage() { // 평균을 구하는 메소드
		int total;
		total = getTotal();   // 이러한 형식을 활용하면 클래스 내부의 같은 객체 내의 메소드이므로 객체 이름을 사용하지 않음
		int average = total / num.length;
		return average;
		}
}
