import java.util.Scanner;

public abstract class Converter {
	abstract double convert(double src); // 추상 메소드
	   abstract String getSrcString(); // 추상 메소드
	   abstract String getDestString(); // 추상 메소드
	  double ratio; // 비율
	   
	   public void run() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
	      System.out.print(getSrcString()+"을 입력하세요>> ");
	      double val = scanner.nextDouble();
	      double res = convert(val);
	      System.out.println("변환 결과: "+res+getDestString()+"입니다");
	      scanner.close();
	   }
}
