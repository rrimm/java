
public class Rectangle implements Cloneable {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
		}
	
	public Object clone() {	// 오버라이드
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
