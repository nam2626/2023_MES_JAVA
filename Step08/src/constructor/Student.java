package constructor;

public class Student {
	String studentNo;
	String studentName;
	String major;
	double score;
	String profileImgUrl;
	
	//기본 생성자
	Student(){
		System.out.println("Student 기본 생성자");
	}
	//모든 필드 초기화하는 생성자
	Student(String sno, String sname, String m, double s, String p){
		System.out.println("Student(String, String, String, double, String)");
		studentNo = sno;
		studentName = sname;
		major = m;
		score = s;
		profileImgUrl = p;
	}
	
	/*
	 * this : 자기 자신 객체를 나타냄
	 * 		  지역변수가 필드명이랑 같으면 무조건 지역변수에 접근한다.
	 * 		  이때 필드에 접근하기 위해서 자기 자신 객체를 this로 정의를 해놓은 키워드
	 */
	public Student(String studentNo, String studentName, String major) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.major = major;
	}
	
	public Student(String studentNo, double score, String profileImgUrl) {
		super();
		this.studentNo = studentNo;
		this.score = score;
		this.profileImgUrl = profileImgUrl;
	}
	
	
	
	
}










