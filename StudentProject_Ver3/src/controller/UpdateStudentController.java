package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다....");
		System.out.print("수정할 학생번호 입력 ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		if(vo == null)
			System.out.println("수정할 학생정보가 없습니다.");
		else {
			System.out.print("수정할 이름 : ");
			String studentName = sc.nextLine();
			vo.setStudentName(studentName);
			System.out.print("수정할 학과명 : ");
			String major = sc.nextLine();
			vo.setMajor(major);
			System.out.print("수정할 평점 : ");
			double score = sc.nextDouble();
			sc.nextLine();
			vo.setScore(score);
			System.out.println("학생정보 수정을 완료하였습니다.");
		}
	}

}










