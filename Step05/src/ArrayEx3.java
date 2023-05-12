import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		//정수형 배열 5개 짜리 선언 후 값을 임의로 초기화
		int[] arr = {1,2,3,4,5};
		
		for(int n : arr) {
			System.out.println(n);
			n++;
		}
		
		System.out.println(Arrays.toString(arr));//배열에 저장된 내용을 문자열로 만들어줌
	}

}
