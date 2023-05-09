import java.util.Scanner;

public class Quest3 {
	/*
	 * 삼각형의 밑변과 높이를 정수로 입력받아서
	 * 입력한 삼각형의 밑변과 높이 값을 이용해서 삼각형의 넓이를 출력
	 * 단, 넓이는 소수점까지 포함
	 */
	public static void main(String[] args) {
		//1. 변수 선언
		int w = 0, h = 0;
		//2. 데이터 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 밑변 : "); 
		w = sc.nextInt();
		System.out.print("삼각형의 높이 : "); 
		h = sc.nextInt();
		//3. 결과 출력
		System.out.println(w * h / 2.0);
		
		
	}

}







