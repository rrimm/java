import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {	
			String str = list.get(cnt);	// 연결리스트이므로 cnt에 2를 바로 기입해도 0부터 탐색하기 시작하는 단점
			System.out.println(str);
		}
		for(String str : list) {	// 향상된 for문을 사용하면 내부적으로 순차적인 구조를 만듦. 그러므로 한 번에 일괄로 데이터를 다룰 때 향상된 for문 사용이 좋음
			System.out.println(str);
		}
	}
}
