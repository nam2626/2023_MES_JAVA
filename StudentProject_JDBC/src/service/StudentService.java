package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dao.StudentDAO;
import exception.StudentException;
import vo.StudentVO;

/*
 * 	학생정보를 배열에 저장을 함
 * 	학생정보를 추가, 삭제, 수정, 조회, 전체 조회 
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	
		
	private StudentService() {	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public void insertStudent(StudentVO vo) throws SQLException {
		StudentDAO.getInstance().insertStudent(vo);
	}


	public StudentVO searchStudent(String studentNo) throws StudentException {
		StudentVO vo = StudentDAO.getInstance().selectStudent(studentNo);
		if(vo == null)
			throw new StudentException("검색한 해당 학생정보가 없습니다.");
		return vo;
	}

	public void deleteStudent(String studentNo) throws StudentException {
		int result = StudentDAO.getInstance().deleteStudent(studentNo);
		if(result == 0)
			throw new StudentException("학생정보 삭제에 실패했습니다.");
	}

	public void checkStudentNo(String studentNo) throws StudentException {
		StudentVO vo = StudentDAO.getInstance().selectStudent(studentNo);
		if(vo != null) {
			throw new StudentException("중복된 학번을 입력했습니다.");
		}
	}

	public ArrayList<StudentVO> selectAllStudnet() {
		return StudentDAO.getInstance().selectAllStudent();
	}

	public void updateStudent(StudentVO vo) throws SQLException {
		StudentDAO.getInstance().updateStudent(vo);
	}
	
	
}











