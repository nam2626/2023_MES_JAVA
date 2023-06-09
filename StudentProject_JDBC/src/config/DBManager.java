package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//싱글톤 패턴
public class DBManager {
	private static DBManager instance = new DBManager();

	//DB 접속 정보
	private Connection conn;
	
	private DBManager() {
		//드라이버 클래스 로드 후 DB 접속한 정보를 conn 저장
		try {
			Class.forName(DBConfig.DB_DRIVER);
			conn = DriverManager.getConnection(DBConfig.DB_URL, 
								DBConfig.DB_USER, DBConfig.DB_PASSWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DBManager getInstance() {
		if(instance == null)
			instance = new DBManager();
		return instance;
	}

	public Connection getConn() {
		return conn;
	}

	
	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}






