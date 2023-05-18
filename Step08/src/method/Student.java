package method;

public class Student {
	private String studentNo;
	private String studentName;
	private String major;
	private double score;
	
	public Student() {	}

	public Student(String studentNo, String studentName, String major, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.major = major;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", major=" + major + ", score="
				+ score + "]";
	}
	
	
	public void printStudentInfo() {
		System.out.printf("%s %s %s %f(%s)\n",studentNo,studentName,major,score,getGrade());
	}
	/*
	 * 4.5 A+
	 * 4.4~4.0 A
	 * 3.9~3.5 B+
	 * 3.4~3.0 B
	 * 2.9~2.5 C+
	 * 2.4~2.0 C
	 * 1.9~1.5 D+
	 * 1.4~1.0 D
	 * 0.9~0.0 F
	 * 
	 */
	private String getGrade() {
		int score = (int)(this.score * 10);
		String result = "F";
		
		switch(score / 5) {
		case 9:
			result = "A+";
			break;
		case 8:
			result = "A";
			break;
		case 7:
			result = "B+";
			break;
		case 6:
			result = "B";
			break;
		case 5:
			result = "C+";
			break;
		case 4:
			result = "C";
			break;
		case 3:
			result = "D+";
			break;
		case 2:
			result = "D";
			break;
		}
		
		return result;
	}
	
	
}

















