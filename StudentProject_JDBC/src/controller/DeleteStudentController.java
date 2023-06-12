package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;

public class DeleteStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다....");
		System.out.print("삭제할 학생번호 입력 ");
		String studentNo = sc.nextLine();
		
		try {
			StudentService.getInstance().deleteStudent(studentNo);
			System.out.println("학생정보 삭제 완료.");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}












