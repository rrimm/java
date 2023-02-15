
public class ConstrExample2 {

	public static void main(String[] args) {
		SubscriberInfo obj1, obj2;  		// 동일한 패키지에 배치해서 사용가능
		obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");	//obj1이 가리키는 것이 객체, obj1은 객체를 가리키는 주소(레퍼런스변수)지만 보통은 obj1을 객체라고 편하게 부름
		obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-000-0000", "타워팰리스");
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		}
	
	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();

	}

}
