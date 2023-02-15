
public class FieldExample2 {

	public static void main(String[] args) {
		
		Circle obj = new Circle(0.0);
		obj.radius = 5.0; // Circle 클래스의 필드에 값을 대입
		double area = obj.getArea();
		System.out.println(obj.radius); // Circle 클래스의 필드 값을 출력
		System.out.println(area);

	}

}
