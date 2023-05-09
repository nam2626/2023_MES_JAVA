import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		// 반지름 하나 정수로 입력 받아서 입력 받은 반지름의 원넓이를 출력
		// 단 원넓이는 소수점까지 출력
		// 1. 변수선언
		int r = 0;
		double area = 0.0;
		// 2. 반지름 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 >>> ");
		r = sc.nextInt();
		// 3. 원넓이 계산 후 출력
		area = r * r * 3.1415;
		System.out.println(area);
	}

}







