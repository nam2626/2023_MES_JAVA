package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DBManager;

public class JDBCTest5 {

	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from student";
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)+ " "
							+ rs.getInt(3) + " " + rs.getDouble("std_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getInstance().close(pstmt, rs);
		} 

	}

}





