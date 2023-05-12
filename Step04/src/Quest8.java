import java.util.Scanner;

public class Quest8 {
	/*
	 * 	영화 평점을 1~5까지의 정수로 입력을 받음
	 * 	입력 받은 평점 만큼 ★을 출력하시오
	 * 	별 출력 후 프로그램이 종료
	 * 
	 * 	실행 예시>
	 * 	이번 영화의 평점을 입력 하세요 : 3
	 * 	평점 : ★★★ 
	 * 
	 * 	이번 영화의 평점을 입력 하세요 : 6
	 * 	평점은 1~5 사이만 입력할 수 있습니다.
	 * 	이번 영화의 평점을 입력 하세요 : 4
	 * 	평점 : ★★★★ 
	 * 	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//1. 평점 입력
			System.out.print("이번 영화의 평점을 입력 하세요 : ");
			int score = sc.nextInt();
			if(score < 1 || score > 5) {
				//2. 평점이 1~5가 아니면 다시 입력
				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
				continue;
			}
			//3. 평점이 1~5면 별 출력하고 종료
			String star = "";
			for(int i=0;i<score;i++) {
				star += "★";
			}
			System.out.println("평점 : " +  star);
			break;
		}
	}

}
















