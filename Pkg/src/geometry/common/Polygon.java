package geometry.common;

public class Polygon {
	protected int x[]; 		// 꼭지점의 X 좌표
	protected int y[]; 		// 꼭지점의 Y 좌표
	
	protected Polygon(int vertexNum) {
	x = new int[vertexNum];
	y = new int[vertexNum];
	}
	
	protected void setPoint(int index, int x, int y) {
	this.x[index] = x;
	this.y[index] = y;
	}
}
