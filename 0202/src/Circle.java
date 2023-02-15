
public class Circle {
	int radius; // 반지름

	Circle(int radius) {
		this.radius = radius;
	}

	public boolean equals(Object obj) {	// equals 메소드 오버라이딩
		if (!(obj instanceof Circle)) {	// obj 객체를 circle 클래스 타입으로 캐스트연산 할 수 있으면 true, 불가능하면 false
			return false;
		}
		Circle circle = (Circle) obj;
		if (radius == circle.radius) {
			return true;
		} else {
			return false;
		}
	}
}
