

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("해리", 95);
		hashtable.put("헤르미온느", 100);
		hashtable.put("론", 85);
		hashtable.put("드레이코", 93);
		hashtable.put("네빌", 70);
		Integer num = hashtable.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? " + num);

	}
}
