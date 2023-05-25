package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다....");
		System.out.print("삭제할 학생번호 입력 ");
		String studentNo = sc.nextLine();
		
		boolean result = StudentService.getInstance().deleteSutdent(studentNo);
		
		if(result)
			System.out.println("학생정보 삭제 완료.");
		else
			System.out.println("삭제할 학생정보가 없습니다.");
	}

}












