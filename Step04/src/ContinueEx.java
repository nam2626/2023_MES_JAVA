
public class ContinueEx {
	/*
	 * 	continue
	 * 		반복문에서 남은 일을 무시하고 다음 반복을 진행 할때 사용하는 키워드
	 * 		if문과 주로 같이 쓰인다.
	 */
	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			if(i % 2 == 1)
				continue;
			System.out.println(i);
		}
	}

}
