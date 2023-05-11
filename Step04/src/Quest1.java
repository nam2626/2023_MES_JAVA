import java.util.Scanner;

public class Quest1 {
	/*
	 * 	정수 하나를 입력 받은 후에
	 *  입력 받은 정수의 약수와 약수의 개수를 출력
	 *  
	 *  실행 예시>
	 *  숫자 입력 : 6
	 *  1 2 3 6
	 *  약수의 개수 : 4
	 */
	public static void main(String[] args) {
		//1. 숫자 입력
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("단 입력 >>> ");
		num = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=num;i++) {
			//2. 반복문 -> 약수 목록
			if(num % i == 0) {
				System.out.print(i + " ");
				//3. 반복문 -> 약수 개수 구함
				count++;
			}
		}
		System.out.println();
		//4. 약수 개수 출력
		System.out.println("약수 개수 : "+count);
		
		
		
	}

}












