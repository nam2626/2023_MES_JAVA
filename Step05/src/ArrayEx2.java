
public class ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성과 동시에 초기화 하는 방법 - 1
		int[] arr1 = {1,2,3,4,5};
		
		//arr1의 내용을 전부 출력
		for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("-------------------");
		//배열 생성과 동시에 초기화 하는 방법 - 2
		int[] arr2 = new int[] {5,6,7,8,9,10};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("-------------------");
		//정수형 배열 7개 짜리 선언 후 바로 출력
		int[] arr3 = new int[7];//생성을 하면 자동으로 0으로 초기화
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
	}

}









