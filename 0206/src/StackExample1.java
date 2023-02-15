import java.util.LinkedList;

public class StackExample1 {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12);	// push의 개념
		stack.addLast(59);
		stack.addLast(7);
		System.out.println("stack.getLast() : " + stack.getLast());	// peek 개념
		while (!stack.isEmpty()) {
			Integer num = stack.removeLast();	// pop 개념. 스택의 값을 읽은 후 삭제
			System.out.println(num);
		}
		
	}

}
