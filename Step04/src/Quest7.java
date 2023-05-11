import java.util.Scanner;

public class Quest7 {
	/*
	 * 		숫자 입력 : 6
	 * 					줄번호	별 개수	공백 개수
	 * 		     *			1		1		5			
	 * 		    ***			2		3		4
	 * 		   *****		3		5		3
	 * 		  *******		4		7		2
	 * 		 *********		5		9		1
	 * 		***********		6		11		0
	 * 
	 * 		위 예시와 같은 삼각형 출력하는 코드를 작성
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int ea = sc.nextInt();
		
		for(int i=1;i<=ea;i++) {
			for(int j=0;j<(ea - i);j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}

}














