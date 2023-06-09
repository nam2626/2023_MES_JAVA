package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			System.out.println("DB 접속 완료");
			//3. SQL Generate
			String sql = "insert into student values('44444444', '홍길동', 3.3, 2)";
			//4. Statement Create
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. Run SQL
			int count = pstmt.executeUpdate();
			System.out.println(count);
			//6. Close
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
