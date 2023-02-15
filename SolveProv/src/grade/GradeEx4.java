package grade;
public class GradeEx4 {

	public static void main(String[] args) {
		Grade obj = new Grade();
		
		obj.input();
		obj.calculate();
		
		
	System.out.println("\n\t\t *** 성적표 ***");
	System.out.println("===============================================");
	System.out.println("학번   이름    국어    영어    수학    총점    평균   등급");
	System.out.println("===============================================");
	obj.output();
	System.out.println("===============================================");

	}

}
