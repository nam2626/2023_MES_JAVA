package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class InsertStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		//데이터 입력을 받음
		System.out.println("학생정보 등록을 시작합니다......");
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String studentName = sc.nextLine();
		System.out.print("학과명 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		//서비스 클래스의 데이터 등록하는 메서드를 호출
		boolean result = StudentService.getInstance().insertStudent(
									new StudentVO(studentNo, studentName, major, score));
		
		if(result)
			System.out.println("학생정보 등록이 되었습니다.");
		else
			System.out.println("학생정보 등록에 실패하였습니다.");
	}

}








