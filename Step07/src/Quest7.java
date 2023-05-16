
public class Quest7 {
	/*
	 * 마방진 문제
	 * https://ko.wikipedia.org/wiki/%EB%A7%88%EB%B0%A9%EC%A7%84
	 */
	public static void main(String[] args) {
		int size = 3;
		int[][] arr = new int[size][size];
		//  행번호   열번호              저장할 숫자 개수
		int row=0, col=arr.length/2, count = arr.length * arr.length;
		int num = 1;//저장할 숫자
		
		while(num <= count) {
			//배열에 값을 저장
			arr[row][col] = num++;
			
			//행번호, 열번호를 계산
			//1. 오른쪽 위로 이동이 기본 -> 행번호 -, 열번호 +
			//2. 이동할 위치가 인덱스 범위를 벗어났느냐? -> 벗어나면 반대로 이동 3 -> 0, -1 -> 2
			//3. 다음 위치에 값이 있냐? 있으면 -> 현재 위치에서 아래로 이동, 없으면 이동
			//4. 계산한 행번호 열번호를 row, col에 저장
			int tempRow = row, tempCol = col;//임시변수에 현재 행번호, 열번호 저장
			
			tempRow--;//행번호 감소
			tempCol++;//열번호 증가
			
			if(tempRow == arr.length) tempRow -= arr.length;
			if(tempCol == arr.length) tempCol -= arr.length;
			if(tempRow == -1) tempRow += arr.length;
			if(tempCol == -1) tempCol += arr.length;
			
			if(arr[tempRow][tempCol] != 0) {
				//이동할 위치에 값이 있다.
				//행번호만 증가
				row++;
			}else {
				row = tempRow; col = tempCol; //계산된 인덱스 번호를 저장
			}
			
			//중간 과정 출력 --> 배열 내용을 전부 출력
			for(int i=0;i<arr.length;i++) {
				for(int n : arr[i]) {
					System.out.printf("%2d ",n);
				}
				System.out.println();
			}
			System.out.println("-------------------");
		}
		
	}

}




