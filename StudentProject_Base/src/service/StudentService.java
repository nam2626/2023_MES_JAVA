package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.StudentVO;

/*
 * 	학생정보를 배열에 저장을 함
 * 	학생정보를 추가, 삭제, 수정, 조회, 전체 조회 
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	
	private ArrayList<StudentVO> list; 
		
	private StudentService() {
		list = new ArrayList<StudentVO>();
		//학생 데이터를 미리 5건 저장
		list.add(new StudentVO("20001111", "김철수", "경영학과", 4.1));
		list.add(new StudentVO("20001112", "이영수", "경제학과", 4.5));
		list.add(new StudentVO("20001113", "박영희", "컴퓨터공학과", 2.7));
		list.add(new StudentVO("20001114", "문수영", "게임학과", 4.5));
		list.add(new StudentVO("20001115", "길희수", "생활체육학과", 3.5));
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}


	
}











