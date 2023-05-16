
public class BubleSort {

	public static void main(String[] args) {
		int[] arr = {8, 4, 6, 9, 7, 1};
		//1번 정렬을 수행하는 반복문을 작성
		//기준값이랑 뒤에값이랑 비교해서 큰값을 뒤로, 작은 값을 앞으로 저장(데이터 교환)
		for(int c=0;c<arr.length-1;c++) {
			for(int i=0; i<arr.length-1-c; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			//출력
			for(int n : arr) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
		
	}

}

