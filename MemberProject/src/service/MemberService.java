package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.MemberVO;
//컨트롤러가 보내준 데이터를 가지고서
//데이터 작업(조회, 추가, 삭제, 수정.....)하고나서 결과를 컨트롤러에게 다시 리턴
public class MemberService {
	private static MemberService instance = new MemberService();
	
	private ArrayList<MemberVO> list; 
		
	private MemberService() {
		list = new ArrayList<MemberVO>();
	}

	public static MemberService getInstance() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}

	public boolean addMember(MemberVO vo) {
		return list.add(vo);
	}


	
}











