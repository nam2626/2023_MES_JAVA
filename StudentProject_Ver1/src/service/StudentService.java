package service;

import java.util.Scanner;

import vo.StudentVO;

/*
 * 	학생정보를 배열에 저장을 함
 * 	학생정보를 추가, 삭제, 수정, 조회, 전체 조회 
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] arr;
	
	private StudentService() {
		arr = new StudentVO[5];
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	//학생정보 추가하는 작업
	public void insertStudentVO(Scanner sc) {
		//1. 학생정보 입력
		//2. StudentVO 객체 생성
		//3. 배열의 빈요소에 저장
	}
}








