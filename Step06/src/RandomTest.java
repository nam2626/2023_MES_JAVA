
public class RandomTest {

	public static void main(String[] args) {
		System.out.println(Math.random());
		//(int)(랜덤 * (최대값 - 최소값 + 1)) + 최소값
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*71) + 30;
			System.out.println(n);
		}
		
	}

}
