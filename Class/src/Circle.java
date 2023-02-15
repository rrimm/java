
public class Circle {
	double radius; // 필드 
	
	Circle(double radius) { // 생성자 
		this.radius = radius; 
	} 
	double getArea() { // 메소드 
		double area ; 
		area = radius * radius * 3.14; 
		return area; 
		}
	}

