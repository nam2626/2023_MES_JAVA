import java.util.Scanner;

public class Quest4 {
	/*
	 * 숫자 하나를 입력받아서
	 * 해당 숫자가 짝수인지 홀수인지 출력
	 * 짝수에 0을 포함, 변수는 1개만 사용
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >>> ");
		int n = sc.nextInt();
		
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
	}

}
