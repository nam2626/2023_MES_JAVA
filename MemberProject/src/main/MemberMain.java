package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.MemberService;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메뉴 출력
			System.out.println("----회원관리프로그램----");
			System.out.println("1. 회원정보 등록");
			System.out.println("2. 회원정보 검색");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");

			int no = sc.nextInt();
			sc.nextLine();
			if(no == 0) break;
			
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null) controller.excute(sc);
			else System.out.println("정확한 메뉴 번호를 입력하세요.");
			
		}
	}

}
















