import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		//정수형 변수 두개 선언 후 정수 두개 입력을 받은 후
		//입력받은 값의 사칙 연산 결과를 각각 출력
		//1. 변수선언
		int n1=0, n2=0;
		//2. 데이터 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		//3. 계산 & 출력
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

}








