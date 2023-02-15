
public class InterfaceExample1 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863774개", "개미", "베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
//		obj1.checkOut("김영숙", "20060315");
//		obj2.checkOut("박희경", "20060317");
//		obj1.checkIn();
//		obj2.checkIn();
		checkOut(obj1, "김영숙", "20060315");
		checkOut(obj2, "박희경", "20060317");
		checkIn(obj1);
		checkIn(obj2);
	}
	
	static void checkOut(Lendable obj, String str1, String str2)  {
		try {
		obj.checkOut(str1, str2);
		}
		catch (Exception e) {}
	}
	static void checkIn(Lendable obj) {		// 메소드 다형성 구현
		obj.checkIn();
	}
}
