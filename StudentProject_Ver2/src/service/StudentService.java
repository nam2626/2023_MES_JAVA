package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.StudentVO;

/*
 * 	학생정보를 배열에 저장을 함
 * 	학생정보를 추가, 삭제, 수정, 조회, 전체 조회 
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	
	private ArrayList<StudentVO> list; 
	private StudentVO[] arr;
	private int idx;//배열에 저장할 곳 관리하는 인덱스 번호
	
	private StudentService() {
		list = new ArrayList<StudentVO>();
		//학생 데이터를 미리 5건 저장
		list.add(new StudentVO("20001111", "김철수", "경영학과", 4.1));
		list.add(new StudentVO("20001112", "이영수", "경제학과", 3.6));
		list.add(new StudentVO("20001113", "박영희", "컴퓨터공학과", 2.7));
		list.add(new StudentVO("20001114", "문수영", "게임학과", 4.5));
		list.add(new StudentVO("20001115", "길희수", "생활체육학과", 3.5));
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	//학생정보 추가하는 작업
	public void insertStudentVO(Scanner sc) {
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

		list.add(new StudentVO(studentNo, studentName, major, score));
	}

	public void printAllStudent() {
		System.out.println("전체 학생정보를 출력합니다.........");
		if(list.isEmpty()) {
			System.out.println("등록된 학생정보가 없습니다.");
			return;
		}
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	public void selectStudentVO(Scanner sc) {
		System.out.println("학생정보 검색을 시작합니다....");
		System.out.print("학생번호 입력 ");
		String studentNo = sc.nextLine();
		
		int i = selectStudentVO(studentNo);
		if(i == -1)
			System.out.println("검색한 학생 정보가 없습니다.");
		else
			System.out.println(list.get(i));
	}

	public int selectStudentVO(String studentNo) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getStudentNo().equals(studentNo)) {
				return i;
			}
		}
		return -1;
	}
	
	public void updateStudentVO(Scanner sc) {
		//1. 검색
		System.out.println("학생정보 수정을 시작합니다......");
		System.out.print("수정할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		int i = selectStudentVO(studentNo);
		if(i == -1) {
			System.out.println("수정할 학생 정보가 없습니다.");
			return;
		}
		//2. 데이터를 입력 받아서 수정
		System.out.print("수정할 이름 : ");
		String studentName = sc.nextLine();
		System.out.print("수정할 학과명 : ");
		String major = sc.nextLine();
		System.out.print("수정할 평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		arr[i].setStudentName(studentName);
		arr[i].setMajor(major);
		arr[i].setScore(score);
		System.out.println("학생정보 수정이 완료되었습니다.");
	}

	public void deleteStudentVO(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다......");
		System.out.print("삭제할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		int i = selectStudentVO(studentNo);
		if(i == -1) {
			System.out.println("삭제할 학생 정보가 없습니다.");
			return;
		}
		
		for (int j = i; j < idx-1; j++) {
			arr[j] = arr[j+1];			
		}
		idx--;
	}

	public void maxScoreStudent() {
		int max = 0;
		
		for (int i = 1; i < idx; i++) {
			if(arr[max].getScore() < arr[i].getScore())
				max = i;
		}
		System.out.println("석차 1등 학생");
		System.out.println(arr[max].toString());
	}
}











