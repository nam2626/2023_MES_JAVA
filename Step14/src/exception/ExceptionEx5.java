package exception;

import java.util.Scanner;

public class ExceptionEx5 {
	public static int div(int n1, int n2)  {
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
			if(n2 == 0)
				throw new Exception("0으로 나눌수 없습니다.");
			
			System.out.println(div(n1,n2));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}








