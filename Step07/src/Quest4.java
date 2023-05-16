
public class Quest4 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sw = 1, col = 0, count = 1;
		
		for(int i=0;i<arr.length;i++) {
			while(col < arr.length && col >= 0) {
				arr[i][col] = count++;
				col += sw;
			}
			sw = -sw;
			col += sw;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}
