
public class ParamExample1 {

	public static void main(String[] args) {  //파라미터 설계 run configuration
		for (String str : args)  //args개수만큼 출력
			System.out.println(str);
			System.out.println("args.length=" + args.length);

	}

}
