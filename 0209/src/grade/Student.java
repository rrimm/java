package nested.grade;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	ArrayList<Grade> list = new ArrayList<Grade>();	// 데이터를 관리하기 위한 arraylist(Grade 클래스는 Student 클래스에 포함)

	void addGrade() {	// Grade 객체 만들어서 list에 추가
		Grade obj = new Grade();
		obj.input();
		obj.process();
		list.add(obj);	// 객체 저장
	}

	void removeGrade(int index){
	list.remove(index);
	}

	int getGradeNum() {
		return list.size();
	}

	Grade getGrade(int index) {
		return list.get(index);
	}

	double getTotalAvg() {
		double tot_avg = 0;
		for (Grade obj : list)
			tot_avg += obj.avg;
        return tot_avg;
	}

	void changeStudentNumber(int index, String stdid) {
		Grade grade = list.get(index);
		grade.stdid = stdid;
	}

	public class Grade {

		String stdid, name;
		int kor, eng, math, tot;
		double avg;
		String grade;

		Grade() {

		}

		public void input() { // inputData(): 사원정보 저장

			Scanner scan = new Scanner(System.in);

			System.out.print("학번 입력 => ");
			stdid = scan.next();
			System.out.print("이름 입력 => ");
			name = scan.next();
			System.out.print("국어점수 입력 => ");
			kor = scan.nextInt();
			System.out.print("영어점수 입력 => ");
			eng = scan.nextInt();
			System.out.print("수학점수 입력 => ");
			math = scan.nextInt();
		}

		public void process() {
			tot = kor + eng + math;
			avg = tot / 3.;

			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = "수";
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default:
				grade = "가";
				break;
			}
		}

		public void output() { // 입력받은 사원정보 출력 . 데이터가 없으면 데이터가 없다고 메세지

			System.out.printf("%4s\t%3s\t%3d\t%3d\t%3d\t%3d\t%6.2f\t%2s\n", stdid, name, kor, eng, math, tot, avg, grade);

		}
	}

}

	

