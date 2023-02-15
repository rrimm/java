package geometry.shape;


public class Square extends geometry.common.Polygon {
	public Square(int x, int y, int sideLength) {
			super(4);
			setPoint(0, x, y);
			setPoint(1, x + sideLength, y);
			setPoint(2, x + sideLength, y + sideLength);
			setPoint(3, x, y + sideLength);
		}
	
		public int getX(int index) {
			return x[index];
		}
		
		public int getY(int index) {
			return y[index];
		}
}
