package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class SearchStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("학생정보 검색을 시작합니다....");
		System.out.print("학생번호 입력 ");
		String studentNo = sc.nextLine();
		
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			System.out.println(vo);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}








