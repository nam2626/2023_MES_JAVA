package service;

import java.util.Scanner;

import vo.StudentVO;

/*
 * 	학생정보를 배열에 저장을 함
 * 	학생정보를 추가, 삭제, 수정, 조회, 전체 조회 
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] arr;
	private int idx;//배열에 저장할 곳 관리하는 인덱스 번호
	
	private StudentService() {
		arr = new StudentVO[5];
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	//학생정보 추가하는 작업
	public void insertStudentVO(Scanner sc) {
		System.out.println("학생정보 등록을 시작합니다......");
		//1. 학생정보 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String studentName = sc.nextLine();
		System.out.print("학과명 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		//2. StudentVO 객체 생성
		StudentVO vo = new StudentVO(studentNo, studentName, major, score);
		//3. 배열의 빈요소에 저장
		//	3-1. 배열에 빈공간이 없다면?
		//       배열의 크기를 늘려주고 저장
		if(idx == arr.length) {
			StudentVO[] temp = new StudentVO[arr.length+3];
			//System.arraycopy(복사할 원본배열,복사를 시작할 인덱스번호, 복사할 곳 배열, 복사할 인덱스번호,복사받을 값의 개수);
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		//  3-2. 빈공간이 있으면 빈공간에 저장
		arr[idx++] = vo;
	}
}











