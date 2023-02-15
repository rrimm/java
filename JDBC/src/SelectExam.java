import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExam {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "Select * From usertbl";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);	// executeQuery메소드는 SQL문장이 SELECT문일 때 사용
			System.out.println("userID\t name\t birthYear\t addr\t mobile1\t mobile2\t height\t    mDate ");
			System.out.println("----------------------------------------------------------------------------------------");
			while(rs.next()){
				System.out.print(rs.getString("userID") + "\t");
				System.out.print(rs.getString("name") + "   \t   ");
				System.out.print(rs.getInt("birthYear") + "\t\t");
				System.out.print(rs.getString("addr") + "  \t  ");
				System.out.print(rs.getString("mobile1") + "\t\t");
				System.out.print(rs.getString("mobile2") + "\t\t");
				System.out.print(rs.getInt("height") + "\t");
				System.out.println(rs.getString("mDate") + "\t");
				
				}
		}
		catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
