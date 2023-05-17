
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {8, 4, 6, 9, 7, 1};
		
		//1. 해당 작업을 총 배열 개수 - 1 만큼 수행
		//2. 0번 인덱스부터 ~ 마지막 인덱스 전까지 기준 값으로 잡음
		for (int i = 0; i < arr.length - 1; i++) {
			//3. 기준값 다음 인덱스부터 ~ 마지막 인덱스까지 기준값이랑 비교
			for (int j = i+1; j < arr.length; j++) {
				//4. 비교시 작은 값이 기준값이 있는 위치로 가게끔 데이터 값을 교환
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		for(int n : arr) {
			System.out.printf("%2d ",n);
		}
		System.out.println();
	}

}
