import java.util.Scanner;

public class Quest10 {
	/*
	 * 	숫자 하나 입력 받아서
	 * 	입력 받은 숫자가 소수 인지 출력을 하시오.
	 * 	소수는 1과 자기자신으로만 나누어지는 숫자
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		boolean flag = true;
		
		if(n < 2) flag = false;
		
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
			
	}

}

















