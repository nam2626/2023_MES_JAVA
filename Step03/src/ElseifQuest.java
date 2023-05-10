import java.util.Scanner;

public class ElseifQuest {
	/*
	 *  점수 하나를 입력 받아서
	 *  100~90 A 
	 *   89~80 B
	 *   79~70 C
	 *   69~60 D
	 *   59~ 0 F
	 *   성적등급을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = 0;
		String grade = "F";
		
		System.out.print("점수 입력(0~100) >>> ");
		score = sc.nextInt();
		if(score > 100 || score < 0) {
			grade = "잘못된 데이터 입니다.";
		}else if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}
		
		if(score >= 70) {
			grade += score % 10 >= 5 ? "+" : "";
		}
		
		System.out.println(grade);
		
			
	}

}

















