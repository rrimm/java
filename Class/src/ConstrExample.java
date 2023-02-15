
public class ConstrExample {

	public static void main(String[] args) {
		SubscriberInfo2 obj1, obj2;  		// 동일한 패키지에 배치해서 사용가능
		obj1 = new SubscriberInfo2("연흥부", "poorman", "zebi");
		obj2 = new SubscriberInfo2("연놀부", "richman", "money", "02-000-0000", "타워팰리스");
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);

	}
	
	static void printSubscriberInfo(SubscriberInfo2 obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();

	}

}
