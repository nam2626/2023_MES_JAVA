
public class LocalVariable {
	/*	지역 변수(Local Variable)
	 * 		- 코드에서 지정한 실행할 영역에서만 존재하는 변수
	 * 		- { }(메서드, 반복문, if문 -> 실행영역) 내에 선언한 변수는 {}가 끝나면 바로 사라지는 변수
	 */
	public static void main(String[] args) {
		int i = 100;
		if(i % 2 == 0) {
			int j = 5;//if문이 끝나면 사라지는 지역변수
			j++;
		}
//		System.out.println(j);//이 시점에서는 j가 이미 없어져서 에러
		
		//for문 초기화 영역에서 선언한 변수는 for문이 끝나면 사라지는 지역변수
		for(int j = 0;j<5;j++) {
			System.out.println(j);
		}
//		System.out.println(j);
		
	}

}






