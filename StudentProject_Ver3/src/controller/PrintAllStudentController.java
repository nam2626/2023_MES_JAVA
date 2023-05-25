package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllStudentController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("학생정보 출력을 시작합니다..........");
		ArrayList<StudentVO> list = StudentService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("출력할 학생정보가 하나도 없습니다.");
			return;
		}
		
		for(StudentVO vo : list) {
			System.out.println(vo);
		}

	}

}












