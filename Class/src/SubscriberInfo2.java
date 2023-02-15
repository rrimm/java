
public class SubscriberInfo2 {
	String name, id, password, phoneNo, address;  
	
	SubscriberInfo2(String name, String id, String password) { 	//생성자 앞에는 리턴타입(void, int 등)이 없음
		this.name = name; 			//3개의 값을 전달받아 3개의 값으로 초기화. name, id, password
		this.id = id; 
		this.password = password; 
		} 
	SubscriberInfo2(String name, String id, String password, String phoneNo, String address) { 
		this.name = name; 			//5개의 값을 전달받아 5개의 값으로 초기화. name, id, password, phoneNo, address
		this.id = id; 
		this.password = password; 
		this.phoneNo = phoneNo; 
		this.address = address; 
		} 
	void changePassword(String password) { 
		this.password = password; 
		} 
	void setPhoneNo(String phoneNo) { 
		this.phoneNo = phoneNo; 
		} 
	void setAddress(String address) { 
		this.address = address; 
		}
}
