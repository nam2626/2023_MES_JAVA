
public class Quest1 {
	/*
	 * 	2차원 배열을 선언해서
	 * 	로또번호를 총 5셋트 저장 (5행 6열)
	 * 	생성한 전체 로또 번호를 출력
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][];
		
		for(int i=0;i < arr.length; i++) {
			//로또번호 1셋트 생성하는 부분
			int[] lotto = new int[6];
			
			for(int j=0;j<lotto.length;j++) {
				lotto[j] = (int)(Math.random()*45) + 1;
				//중복값 처리 부분 -> 중복된 값이 있으면 j 인덱스 값을 감소
				for(int k = 0;k < j; k++) {
					if(lotto[k] == lotto[j]) {
						j--;
						break;
					}
				}
			}
			arr[i] = lotto;//생성 완료된 로또번호 1셋트를 2차원 배열에 등록
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}










