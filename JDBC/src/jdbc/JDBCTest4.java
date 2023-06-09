package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			System.out.println("DB 접속 완료");
			Scanner sc = new Scanner(System.in);
			System.out.print("학번 : ");
			String studentNo = sc.nextLine();
			System.out.print("이름 : ");
			String studentName = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble();
			System.out.print("학과번호 : ");
			int majorNo = sc.nextInt();
			
			//3. SQL Generate
			String sql = "insert into student values(?,?,?,?)";
					
			//4. Statement Create
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentNo);
			pstmt.setString(2, studentName);
			pstmt.setDouble(3, score);
			pstmt.setInt(4, majorNo);
			
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
