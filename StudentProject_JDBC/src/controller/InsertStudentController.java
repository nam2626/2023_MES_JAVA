package controller;

import java.sql.SQLException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class InsertStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		try {
			//데이터 입력을 받음
			System.out.println("학생정보 등록을 시작합니다......");
			System.out.print("학번 : ");
			String studentNo = sc.nextLine();
		
			StudentService.getInstance().checkStudentNo(studentNo);
		
			System.out.print("이름 : ");
			String studentName = sc.nextLine();
			System.out.print("학과명 : ");
			String major = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble();
			sc.nextLine();
			
			//서비스 클래스의 데이터 등록하는 메서드를 호출
			StudentService.getInstance().insertStudent(
										new StudentVO(studentNo, studentName, major, score));
						
			System.out.println("학생정보 등록 성공");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("학생정보 등록 실패");
		}
	}

}








