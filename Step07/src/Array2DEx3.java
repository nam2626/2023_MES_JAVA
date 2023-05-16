
public class Array2DEx3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int count = 1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}










