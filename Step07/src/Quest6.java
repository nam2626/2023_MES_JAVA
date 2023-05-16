
public class Quest6 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 5;//채우는 개수
		int row = 0, col = 0;//가로 세로 인덱스 번호
		int num = 1, sw = 1;
		while(true) {
			//가로로 채우기
			for(int i=0;i<count;i++) {
				arr[row][col] = num++;
				col += sw;
			}
			count--; //가로로 채운 후 채우는 개수가 감소
			
			if(count == 0) break; //더 이상 채울 값이 없을때
			
			//세로로 채우기
			col -= sw;
			row += sw;
			for(int i=0;i<count;i++) {
				arr[row][col] = num++;
				row += sw;
			}
			col -= sw;
			row -= sw;
			sw = -sw;//인덱스 번호 증감하는 변수의 부호 변경 
		}
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
		
		
		
	}

}

