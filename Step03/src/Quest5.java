import java.util.Scanner;

public class Quest5 {
	/*
	 * 숫자 두개를 입력 받아서
	 * 작은 숫자부터 큰숫자까지의 합을 출력
	 * 
	 * 출력 예시>
	 * 숫자 입력 : 10
	 * 숫자 입력 : 1
	 * 
	 * 합의 결과 : 55
	 * ---------------------
	 * 숫자 입력 : 1
	 * 숫자 입력 : 10
	 * 
	 * 합의 결과 : 55
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>> ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 >>> ");
		int n2 = sc.nextInt();
		int sum = 0;
		
		//n1과 n2의 값을 서로 바꿔줌
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		while(n1 <= n2) {
			sum += n1++;
		}
		
		System.out.println("총합 : "+sum);
	}

}














