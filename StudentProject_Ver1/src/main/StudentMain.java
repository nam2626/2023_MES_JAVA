package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = StudentService.getInstance();
		
		while(true) {
			//메뉴 출력
			System.out.println("----학적관리프로그램----");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 전체조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			//메뉴 번호를 입력을 받음
			int no = sc.nextInt();
			sc.nextLine();//줄바꿈 문자 삭제
			//0입력시 반복문 종료
			if(no == 0) break;
			
			//메뉴 번호에 해당하는 기능을 실행
			switch(no) {
			case 1:
				service.insertStudentVO(sc);
				break;
				
			}
		}
	}

}
















