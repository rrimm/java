import java.util.ArrayList;

public class Cart {
	ArrayList<Item> list = new ArrayList<Item>();	// 데이터를 관리하기 위한 arraylist(item클래스는 cart클래스에 포함)

	void addItem(String name, int num, int unitPrice) {	// 아이템 객체 만들어서 list에 추가
		list.add(new Item(name, num, unitPrice));	// 이너클래스의 생성자 호출
	}

	void removeItem(int index){
	list.remove(index);
	}

	int getItemNum() {	// 수량
		return list.size();
	}

	Item getItem(int index) {	// 상품
		return list.get(index);
	}

	int getTotalPrice() {	// 단가계산
		int total = 0;
		for (Item item : list)
			total += item.getPrice();	// 이너클래스의 메소드 호출
		return total;
	}

	void changeItemNumber(int index, int num) {
		Item item = list.get(index);
		item.num = num;	// 이너클래스의 필드 사용
	}

	class Item {// 네스티드 클래스(일반적으로 아래에 정의)
		String name;
		int num;
		int unitPrice;

		Item(String name, int num, int unitPrice) {
			this.name = name;
			this.num = num;
			this.unitPrice = unitPrice;
		}

		int getPrice() {
			return num * unitPrice;
		}
	}
	
}

	

