package dao;

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
		//DB 접속 정보를 가져와서 학생 정보 검색 후 해당 객체를 리턴
		//JDBCTest5를 참고해서 작업
		
		return null;
	}

	
}








