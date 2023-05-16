
public class Quest6 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int count = 5;//채우는 개수
		int row = 0, col = 0;//가로 세로 인덱스 번호
		int num = 1;
		
		//가로로 채우기
		for(int i=0;i<count;i++) {
			arr[row][col] = num++;
			col += 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
		
	}

}

