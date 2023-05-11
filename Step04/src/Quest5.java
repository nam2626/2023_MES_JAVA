import java.util.Scanner;

public class Quest5 {
	/*
	 * 		숫자 입력 : 6
	 * 				줄번호	별개수
	 * 		*		1		1			
	 * 		**		2		2
	 * 		***		3		3
	 * 		****	4		4
	 * 		*****	5		5
	 * 		******	6		6
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














