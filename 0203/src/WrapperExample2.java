
public class WrapperExample2 {

	public static void main(String[] args) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
//			Integer obj = new Integer(args[cnt]); 현재 지원 x. 
			Integer obj = Integer.parseInt(args[cnt]); // 더 간단한 방식 업데이트
			total += obj.intValue();
		}
		System.out.println(total);

	}

}
