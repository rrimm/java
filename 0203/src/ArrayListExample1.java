import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.remove(1);
		list.remove("키위");	// "키위"가 여러개여도 처음 만나는 "키위" 1개만 삭제
		
		int num = list.size();
//		for (int cnt = 0; cnt < num; cnt++) {
//			String str = list.get(cnt);
//			System.out.println(str);
//		} 또는
		for (String str : list) {	// collection타입의 객체 가능
			System.out.println(str);
		}
		

	}

}
