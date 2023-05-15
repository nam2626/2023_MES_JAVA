import java.util.Arrays;
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
		}//end - while
		
		System.out.println("현재 입력된 내용 : " + Arrays.toString(arr));
		//1. 삭제할 숫자를 입력 받음
		System.out.print("삭제할 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		//반복문
		for(int i=0;i<idx;i++) {
			//	2. 삭제할 숫자가 있는 배열 인덱스를 찾음
			if(arr[i] == n) {
				for(int j=i;j<idx-1;j++) {
				//	3. 배열의 내용을 하나씩 땡겨오는 작업
					arr[j] = arr[j+1];
				}
				//  4. 입력 인덱스를 제어하는 변수를 한번 감소
				idx--;
			}
		}
		//5. 배열 내용을 전부 출력
		System.out.println("삭제 결과 : " + Arrays.toString(arr));
	}//end - main

}









