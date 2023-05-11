
public class Quest3 {
	/*
	 *  알파벳 A부터 Z까지 출력
	 *  단, 대문자와 소문자를 아래 형식으로 출력
	 *  A - a
	 *  B - b
	 *  C - c
	 *  ...
	 *  Z - z
	 */
	public static void main(String[] args) {
		for(char c = 'A'; c <= 'Z'; c ++) {
			System.out.println(c + " - " + (char)(c + 32));
		}
	}

}
