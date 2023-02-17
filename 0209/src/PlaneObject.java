
public interface PlaneObject {	
	Location getLocation();

	void setLocation(int x, int y);	// 위치클래스 인터페이스에 있는 메소드는 모두 추상메소드. 오버라이딩 필요

	static class Location {
		int x, y;

		Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
