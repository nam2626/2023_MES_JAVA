import java.util.Scanner;

public class Quest4 {
	/*
	 * 	양수 하나를 입력 받아서
	 *  입력받은 개수 만큼 Hello World 출력
	 */
	public static void main(String[] args) {
		//1. 개수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 개수 입력 >>> ");
		int ea = sc.nextInt();
		//case 1
//		int i = 0;
//		while(i<ea) {
//			System.out.println("Hello World "+i);
//			i++;
//		}
		//case 2
		while(ea > 0) {
			System.out.println("Hello World "+ea);
			ea--;
		}
	}

}












