import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = " + set.size());
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {	// 데이터 읽어오기
			String str = iterator.next();
			System.out.println(str);
		}
		for (String str : set) {	// set으로 사용할 수 있는 것: collection type 객체(arraylist 등)
			System.out.println(str);
		}
	}

}
