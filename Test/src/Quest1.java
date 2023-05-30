import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		for(int i=0;i<10;i++) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			
			if(n % 2 == 1) {
				total += n;
				count++;
			}
		}
		
		System.out.println("입력하신 숫자들 중 홀수의 평균 : " + total / count);
	}

}



