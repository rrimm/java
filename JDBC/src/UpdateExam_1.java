import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateExam_1 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";		// 드라이버 신버전
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";	// serverTimezone=UTC 없으면 오류나는 경우가 많음
		String id = "root";
		String pw = "123456";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String user_id, user_addr, user_mobile2;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner보다 효율적
			System.out.println("usertbl 테이블에 값 변경하기 .....");
			System.out.print("아이디 입력 : ");		
			user_id = br.readLine();
			
			System.out.print("주소 입력 : ");	// 수정
			user_addr = br.readLine();
			
			System.out.print("모바일2 입력 : ");
			user_mobile2 = br.readLine();	// 수정
			

			String sql = "Update usertbl Set addr = ?, mobile2 = ?,Where userID = ?";
//			sql += "('" + user_id + "', '"  + user_addr + "', '" + user_mobile2 + "', '" + "')";
			System.out.println(sql);
			
				
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		pstmt = con.prepareStatement(sql);
		pstmt.executeUpdate();
		System.out.println("데이터 수정 성공!!!");
			
		}
		catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		finally {
			try {
				
				if(stmt != null) pstmt.close();
				if(con != null) con.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	}

}
