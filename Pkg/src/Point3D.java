
public class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
//	int getX() { 	// 잘못된 메소드 Point의 자식클래스에서는 Point의 접근제한자보다 범위가 넓은 접근제한자가 와야 한다.
//	return x;
//	}
	public int getX() {
		return x;
		}
		
	public int getY() { 	// 잘못된 메소드
	return y;
	}
	
	int getZ() {
	return y;
	}
}
