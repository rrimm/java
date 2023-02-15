package test1;

public class StringStack implements Stack {
	
	int cnt; 
	int num;
	String[] stack = new String[num];
	
	public StringStack(int num){
		
		this.cnt = cnt;
		this.num = num;
		
	}
	

	
	@Override
	public int length() {	// 현재 스택에 저장된 개수 리턴
		
		return cnt;
		 }
		
	

	@Override
	public int capacity() {	// 스택의 전체 저장 가능한 개수 리턴
		return num;
		
	}

	@Override
	public String pop() {	// 스택의 톱(top)에 실수 저장
		return stack[--cnt];
		
	}

	@Override
	public boolean push(String val) { // 스택의 톱(top)에 저장된 실수 리턴
		if (cnt == this.num) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		} else {
			val = stack[cnt++];
			return true;
		}
	}

	public boolean empty() {
		if (cnt == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("스택에 저장된 모든 문자열 팝: ");
		while (!empty()) {
			System.out.println(" " + pop());
		}
		System.out.println();
	}
	
}
