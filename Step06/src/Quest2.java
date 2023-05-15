import java.util.Arrays;

public class Quest2 {
	/*
	 * 	정수형 배열 길이가 10개인 배열을 생성 후
	 * 	배열 정수 값을 랜덤하게 채운후 출력
	 * 	값의 범위 15~30까지 정함    
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*16)+15;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}






