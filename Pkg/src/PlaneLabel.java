
public class PlaneLabel implements Movable {
	int x, y;
	String str;
	
	PlaneLabel(int x, int y, String str) {
	this.x = x;
	this.y = y;
	this.str = str;
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
