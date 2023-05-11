import java.util.Scanner;

public class Quest6 {
	/*
	 * 		숫자 입력 : 6
	 * 				줄번호	별 개수	공백 개수
	 * 		     *	1		1		5			
	 * 		    **	2		2		4
	 * 		   ***	3		3		3
	 * 		  ****	4		4		2
	 * 		 *****	5		5		1
	 * 		******	6		6		0
	 * 
	 * 		위 예시와 같은 삼각형 출력하는 코드를 작성
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int ea = sc.nextInt();
		
		for(int i=0;i<ea;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}

}














