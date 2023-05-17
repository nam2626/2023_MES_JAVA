package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = 
				new Student("200012312", "홍길동", "경영학과", 3.4, "https://ffafff.ff.gg/342555");
		
		System.out.println(std2.studentNo);
		System.out.println(std2.studentName);
		System.out.println(std2.major);
		System.out.println(std2.score);
		System.out.println(std2.profileImgUrl);
		
	}

}
