package method;

public class StudentMain {

	public static void main(String[] args) {
		String studentNo = "20001234";
		String studentName = "홍길동";
		String major = "컴퓨터공학과";
		double score = 4.2;
		
		Student std = new Student(studentNo, studentName, major, score);
		std.printStudentInfo();
	}

}
