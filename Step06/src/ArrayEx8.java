import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int idx = 0;//입력받을 배열의 인덱스
		Scanner sc = new Scanner(System.in);
		while(true) {
			//배열 길이 체크 후 배열 길이 늘리는 부분
			if(idx == arr.length) {
				int[] temp = new int[arr.length + 3];
				for(int i=0;i<arr.length;i++)
					temp[i] = arr[i];
				arr = temp;
			}
			
			System.out.print("숫자 입력(-1 입력시 종료) : ");
			arr[idx] = sc.nextInt();
			
			if(arr[idx] == -1) break;
			
			idx++;
		}

	}

}
