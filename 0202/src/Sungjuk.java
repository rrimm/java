import java.util.Scanner;

public class Sungjuk implements Cloneable{	// 메소드 오버라이딩을 통해 캐스트 연산을 하고 주소가 아닌 값을 비교하게 하여 같음을 출력하는 Object 클래스 예제
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	static int cnt = 0;
	static double tot_avg = 0.0;
	
	Sungjuk(){
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어 입력 => ");
		kor = scan.nextInt();
		System.out.print("영어 입력 => ");
		eng = scan.nextInt();
		System.out.print("수학 입력 => ");
		math = scan.nextInt();
	}
	
	void process()
	{
		tot = kor + eng + math;
		avg = tot / 3.;
		
		switch ((int)avg / 10) {
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
	
	void output()
	{
		System.out.printf("%4s  %3s  %3d   %3d   %3d   %3d  %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
	static double getTotal_avg() {
		return tot_avg / cnt;
	}
	
	public boolean equals(Object obj) {	// equals 메소드 오버라이딩
		if (!(obj instanceof Sungjuk)) {	// obj 객체를 circle 클래스 타입으로 캐스트연산 할 수 있으면 true, 불가능하면 false
			return false;
		}
		Sungjuk sungjuk = (Sungjuk) obj;
		if (hakbun.equals(sungjuk.hakbun) && irum.equals(sungjuk.irum) && eng == sungjuk.eng 
				&& math == sungjuk.math && tot == sungjuk.tot) {
				return true;

		} else {
			return false;
		}
	}
	
	public String toString() {
		String str = "학번:" + hakbun + "\n";
		str += "이름:" + irum + "\n";
		str += "국어:" + kor + "\n";
		str += "영어:" + eng + "\n";
		str += "수학:" + math + "\n";
		str += "평균:" + avg + "\n";
		str += "총점:" + tot + "\n";
		str += "등급:" + grade + "\n";
		return str;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}