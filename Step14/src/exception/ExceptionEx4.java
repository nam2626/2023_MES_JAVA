package exception;

import java.util.Scanner;

public class ExceptionEx4 {
	//메서드
	//숫자 두개를 받아서 나눈 결과를 리턴하는 메서드
	public static int div(int n1, int n2) throws ArithmeticException {
		return n1 / n2;
	}
	public static void main(String[] args) {
		//숫자 두개를 입력 받아서
		//위에 만든 숫자 나누는 메서드 실행 후 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		try {
			System.out.println(div(n1,n2));
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}








