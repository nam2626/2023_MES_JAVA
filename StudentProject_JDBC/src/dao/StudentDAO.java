package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public ArrayList<StudentVO> selectAllStudent() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		1. ArrayList<StudentVO> 생성
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
//		2. SQL문 작성 - 전체 학생 정보 조회
		String sql = "select s.std_no, s.std_name, m.major_name, "
				+ "s.std_score from student s, major m "
				+ "where s.major_no = m.major_no";
		try {
//		3. SQL문 실행
			pstmt = manager.getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();
//		4. ResultSet 학생 정보 한건씩 읽어와서 객체 생성 후 ArrayList(1번에서 생성한)에 저장
			while(rs.next()) {
				StudentVO vo = new StudentVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getDouble(4));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(pstmt, rs);
		}
//		5. ArrayList를 StudentService로 리턴
		return list;
	}
	
	public void insertStudent(StudentVO vo) throws SQLException {
		String sql = "insert into STUDENT values(?,?,?,"
				+ "(select major_no from major where major_name = ?))";
		PreparedStatement pstmt = manager.getConn().prepareStatement(sql);
		pstmt.setString(1, vo.getStudentNo());
		pstmt.setString(2, vo.getStudentName());
		pstmt.setDouble(3, vo.getScore());
		pstmt.setString(4, vo.getMajor());
		
		pstmt.executeUpdate();
		
		manager.close(pstmt, null);
	}

	public int deleteStudent(String studentNo) {
		int count = 0;
		
		String sql = "delete from student where std_no = ?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			count = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(pstmt, null);
		}
		
		return count;
	}
	
}














