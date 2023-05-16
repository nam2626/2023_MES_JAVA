
public class Quest5 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sw = 1, row = 0, count = 1;
		
		for(int col = 0; col < arr.length; col++) {
			while(row < arr[col].length && row >= 0) {
				arr[row][col] = count++;
				row += sw;
			}
			sw = -sw;
			row += sw;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}
