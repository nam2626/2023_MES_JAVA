
public class Quest7 {
	/*
	 * 		1~100까지 숫자들 중 4와 7의 배수를 출력
	 * 		단, 4와 7의 공배수는 1번만 출력
	 */
	public static void main(String[] args) {
		int i = 1;

		while (i < 101) {
			if(i % 4 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
