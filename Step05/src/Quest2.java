import java.util.Scanner;

public class Quest2 {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 후에
	 * 	정수를 입력받아서 배열의 각 요소에 전부 입력한 후
	 * 	배열에 저장된 값들 중 최대값, 최소값, 총합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		int max, min, total;
		
		max = min = total = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			total += arr[i];
			if(arr[i] > max)	max = arr[i];
			if(arr[i] < min)	min = arr[i];
			
		}
		System.out.println("총합 : "+total);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}













