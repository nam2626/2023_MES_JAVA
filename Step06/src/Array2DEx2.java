
public class Array2DEx2 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
		//   0 1 2 3
			{1,2,3,4},//0번째 행
			{5,6,7,8},//1번째 행
			{9,10,11,12}//2번째 행
		};
		
		//2차원 배열 전부 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//줄바꿈
		}
	}

}





