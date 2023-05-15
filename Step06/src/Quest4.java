import java.util.Scanner;

public class Quest4 {
	/*
	 * 컴퓨터와 가위바위보를 5번 진행을 해서 
	 * 사용자의 승무패를 출력
	 * 
	 * 가위 - 2, 바위 - 1, 보 - 3
	 * 
	 * 컴퓨터는 랜덤으로 1~3까지 숫자를 뽑음
	 * 사용자로부터는 1~3까지 숫자를 입력 받음
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, d, l;//승 무 패 저장할 변수
		w = d = l = 0;
		String[] str = {"바위","가위","보"};
		for(int i = 0;i < 5; i++) {
			System.out.println( "------ "+ (i+1) + " 회차 ------");
			System.out.print("가위 - 2, 바위 - 1, 보 - 3 입력 하세요 : ");
			int player = sc.nextInt();
			int com = (int)(Math.random() * 3) + 1;
			
			if(player % 3 + 1 == com) {
				System.out.println("사용자 : "+str[player-1] +
						", 컴퓨터 : "+str[com-1] +" 사용자가 이겼습니다.");
				w++;
			}else if(player == com) {
				System.out.println("사용자 : "+str[player-1] +
						", 컴퓨터 : "+str[com-1] +" 비겼습니다.");
				d++;				
			}else {
				System.out.println("사용자 : "+str[player-1] +
						", 컴퓨터 : "+str[com-1] +" 컴퓨터가 이겼습니다.");
				l++;
			}//end - if
		}//end - for
		System.out.println("승 : "+w + ", 무 : " + d +", 패 : " + l);
	}//end - main

}














