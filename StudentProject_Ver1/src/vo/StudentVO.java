package vo;

public class StudentVO {
	//학번 이름 학과명 평점
	private String studentNo;
	private String studentName;
	private String major;
	private double score;
	
	//생성자 필드 전체 초기화
	public StudentVO(String studentNo, String studentName, String major, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.major = major;
		this.score = score;
	}

	//set/get
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	//toString --> 학번 이름 학과명 평점 String.format 사용가능
	@Override
	public String toString() {
		return String.format("%s %s %s %f", studentNo,studentName,major,score);
	}
	
	
}









