import java.util.Scanner;

public class ArrayEx7 {
	/*
	 * 	최초의 정수형 배열은 길이가 5인 배열을 생성
	 * 	
	 *  배열에 숫자를 순서대로 입력해 나가면서
	 *  -1을 입력할때까지 계속해서 배열에 숫자를 입력.
	 *  단, 배열에 내용이 전부채워지면 그때마다 배열의 길이를 3씩 늘림
	 *  
	 *  배열에 숫자 입력이 끝나면 입력된 내용을 전부 출력
	 *  배열에 입력된 숫자들의 평균을 출력
	 *  단, 마지막에 입력된 -1은 제외하고 평균을 구하기
	 * 
	 * 
	 */
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
		int sum = 0;
		for(int i=0;i<idx;i++) {
			sum += arr[i];
		}
		System.out.println(sum / (double)idx);
	}

}












