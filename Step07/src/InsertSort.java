import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();

			// 정렬
			for (int j = i; j > 0 && arr[j] < arr[j-1]   ; j--) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}

			// 정렬되는 과정 출력
			for (int n : arr) {
				System.out.printf("%2d ", n);
			}
			System.out.println();
		}
	}

}





