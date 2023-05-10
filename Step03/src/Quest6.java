import java.util.Scanner;

public class Quest6 {
	/*
	 *  숫자 하나 입력 받아서
	 *  입력한 숫자의 구구단을 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 >>> ");
		int dan = sc.nextInt();
		int i = 1;
		while(i<10) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
	}

}












