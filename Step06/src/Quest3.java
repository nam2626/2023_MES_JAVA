
public class Quest3 {

	public static void main(String[] args) {
		//주사위를 두번 굴려서
		//결과가 더블이 나올때까지 굴린 후 반복문을 종료
		while(true) {
			int dice1 = (int)(Math.random() * 6) +1;
			int dice2 = (int)(Math.random() * 6) +1;
			System.out.println(dice1 + " " + dice2);
			if(dice1 == dice2)
				break;
		}
		
	}

}
