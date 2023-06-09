package controller;

import java.util.Scanner;

import service.MemberService;
import vo.MemberVO;

public class InsertMemberController implements Controller {

	@Override
	public void excute(Scanner sc) {
		// 작업자의 작업은 여기서부터
		// 1. 데이터 입력
		String id = sc.nextLine();
		String passwd = sc.nextLine();
		String name = sc.nextLine();
		boolean gender = sc.nextBoolean();
		// 2. 입력데이터를 이용해서 객체 생성
		MemberVO vo = new MemberVO(id, passwd, name, gender);
		// 3. 서비스로 데이터를 보냄
		boolean result = MemberService.getInstance().addMember(vo);
		// 4. 결과값 받아서 출력
		if(result)
			System.out.println("데이터 정상적으로 등록되었습니다.");
		else
			System.out.println("데이터 등록 작업 실패.");
	}

}







