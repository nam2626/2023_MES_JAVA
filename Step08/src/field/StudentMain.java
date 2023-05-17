package field;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();//객체 생성
		std.studentNo = "2009112233";
		std.studentName = "홍길동";
		std.major = "경영학과";
		std.score = 3.1;
		std.profileImgUrl = "https://img.test.co.kr/01202331";
		
		System.out.println(std.studentNo);
		System.out.println(std.studentName);
		System.out.println(std.major);
		System.out.println(std.score);
		System.out.println(std.profileImgUrl);
		
	}

}
