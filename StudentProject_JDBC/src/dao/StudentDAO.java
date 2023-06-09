package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DBManager;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private DBManager manager;
	
	private StudentDAO() {
		manager = DBManager.getInstance();
	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public StudentVO selectStudent(String studentNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO vo = null;
		//1. SQL 생성
		String sql = "select s.std_no, s.std_name, m.major_name, "
				+ "s.std_score from student s, major m "
				+ "where s.major_no = m.major_no and s.std_no = ?";
		try {
			//2. PreparedStatement 생성
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			//3. SQL 실행
			rs = pstmt.executeQuery();
			//4. 결과 받음
			if(rs.next()) {
				vo = new StudentVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(pstmt, rs);
		}
		//5. 결과 return
		return vo;
	}

	
}








