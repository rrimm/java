package test1;

public interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 실수 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}


//문제: 다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.
//
//interface Stack {
//   int length(); // 현재 스택에 저장된 개수 리턴
//   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
//   String pop(); // 스택의 톱(top)에 실수 저장
//   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
//}
//그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.
//
//총 스택 저장 공간의 크기 입력 >> 3
//문자열 입력 >> hello
//문자열 입력 >> sunny
//문자열 입력 >> smile
//문자열 입력 >> happy
//스택이 꽉 차서 푸시 불가!
//문자열 입력 >> 그만
//스택에 저장된 모든 문자열 팝 : smile sunny hello 
