package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			System.out.println("DB 접속 완료");
			//3. SQL Generate
			String sql = "select * from student";
			//4. Statement Create
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. SQL Excute
			ResultSet rs = pstmt.executeQuery();
			//6. Result Print
			while(rs.next()) {
				//컬럼명이나 컬럼 순번을 써서 해당 컬럼 데이터를 읽어옴
				System.out.println(rs.getString(1) + " " + rs.getString(2)+ " "
							+ rs.getInt(3) + " " + rs.getDouble("std_score"));
			}
			//7. Close
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


