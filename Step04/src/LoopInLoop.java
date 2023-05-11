
public class LoopInLoop {

	public static void main(String[] args) {
		//구구단 2~9단까지 출력
		//for문
		for(int dan=2;dan < 10; dan++) {
			System.out.printf("--%d 단--\n",dan);
			for(int i=1;i<10;i++)
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		//while문
		int dan = 2;
		while(dan < 10) {
			System.out.printf("--%d 단--\n",dan);
			int i = 1;
			while(i < 10) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				i++;
			}
			dan++;
		}
		
	}

}
