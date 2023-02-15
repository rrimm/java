package math;

import geometry.polygon.Rectangle;

public class PackageExample2 {

	public static void main(String[] args) {
//		geometry.polygon.Rectangle obj = new geometry.polygon.Rectangle(2, 3);
		Rectangle obj = new Rectangle(2, 3);
		System.out.println("넓이 = " + obj.width);
		System.out.println("높이 = " + obj.height);
		System.out.println("면적 = " + obj.getArea());

	}

}
