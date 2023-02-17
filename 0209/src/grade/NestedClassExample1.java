package nested.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedClassExample1 {

	public static void main(String[] args) {
		
		Student std = new Student();	// 인클로징 객체 먼저 생성
		
		std.addGrade();	// std 객체 안의 item 클래스를 사용 가능
		System.out.println();
		std.addGrade();
		System.out.println();
		Student.Grade obj = std.new Grade();
		obj.input();
		obj.process();
		std.list.add(obj);
		System.out.println();
		printGrade(std);
	}

	static void printGrade(Student std) {
		int num = std.getGradeNum();
		System.out.println(" 학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for (int cnt = 0; cnt < num; cnt++) {
			Student.Grade obj = std.getGrade(cnt); // cart에 속해있는 Item 클래스의 item
			obj.output();
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf("\t 총학생수 : %d, 전체 평균 : %5.2f\n\n", std.getGradeNum(), std.getTotalAvg() / std.getGradeNum());

	}

}
