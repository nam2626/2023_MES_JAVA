import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println(n);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println(str);		
	}

}
