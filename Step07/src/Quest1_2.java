
public class Quest1_2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 45) + 1;
				// 중복값 처리 부분 -> 중복된 값이 있으면 j 인덱스 값을 감소
				for (int k = 0; k < j; k++) {
					if (arr[i][k] == arr[i][j]) {
						j--;
						break;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int n : arr[i]) {
				System.out.printf("%2d ", n);
			}
			System.out.println();
		}

	}

}
