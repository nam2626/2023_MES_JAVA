
public class Quest3 {

	public static void main(String[] args) {
		int[][] arr = new int[2][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int n = (int)(Math.random() * 10) + 1;
				boolean flag = false;
				for(int k=0;k<arr.length;k++) {
					for(int y=0;y<arr[k].length;y++) {
						if(arr[k][y] == n) {
							flag = true;
						}
					}
				}
				if(flag) j--;
				else arr[i][j] = n;
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




