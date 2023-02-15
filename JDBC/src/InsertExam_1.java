import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam_1 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "Insert Into usertbl(userID, name, birthYear, addr, mobile1, mobile2, height, mDate) Values(?,?,?,?,?,?,?,?)";
		String user_id, user_name, user_addr, user_mobile1, user_mobile2, user_mDate;
		int user_birthYear;
		short user_height;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner보다 효율적
			System.out.println("usertbl 테이블에 값 추가하기 .....");
			System.out.print("아이디 입력 : ");		
			user_id = br.readLine();
			System.out.print("이름 입력 : ");
			user_name = br.readLine();
			System.out.print("생일 입력 : ");
			user_birthYear = Integer.parseInt(br.readLine());
			System.out.print("주소 입력 : ");	// 수정
			user_addr = br.readLine();
			System.out.print("모바일1 입력 : ");
			user_mobile1 = br.readLine();
			System.out.print("모바일2 입력 : ");
			user_mobile2 = br.readLine();	// 수정
			System.out.print("키 입력 : ");
			user_height = (short) Integer.parseInt(br.readLine());
			System.out.print("날짜 입력 : ");
			user_mDate = br.readLine();

//			sql += "('" + user_id + "', '" + user_name + "', '" + user_birthYear + "', '" + user_addr + "', '"
//					+ user_mobile1 + "', '" + user_mobile2 + "', '" + user_height + "', '" + user_mDate + "')";
			System.out.println(sql);

			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);		// 미리 객체 생성
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_name);
			pstmt.setInt(3, user_birthYear);
			pstmt.setString(4, user_addr);
			pstmt.setString(5, user_mobile1);
			pstmt.setString(6, user_mobile2);
			pstmt.setInt(7, user_height);
			pstmt.setString(8, user_id);
			pstmt.executeUpdate();
			System.out.println("데이터 삽입 성공!!!");
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패! = " + e.getMessage());
			
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
