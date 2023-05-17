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
}










