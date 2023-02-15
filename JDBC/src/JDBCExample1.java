import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String[] args) {
		
			Connection conn = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");	// 드라이버 클래스 파일을 등록하여 load
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees",		// 연결 객체 생성(정적 메소드 getConnection(데이터베이스 URL, 사용자 아이디, 패스워드))
			"root","123456");
			System.out.println("데이터베이스에 접속했습니다.");
			conn.close();
			}
			
			catch (ClassNotFoundException cnfe) {	// 데이터베이스 연동 작업 시 에러를 방지하기 위한 예외처리 작업 필요.
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			}
			
			catch (SQLException se){	// getConnection()메소드가 발생시킬 수 있는 에러
			System.out.println(se.getMessage());
			}
			

	}

}
