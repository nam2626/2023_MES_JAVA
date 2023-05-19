package param;

import java.util.Arrays;

public class RefParam {
	//Call by Reference - 참조에 의한 호출 ---> 메모리 주소값이 전달
	public static void addAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	//Call by Value --> 값을 복사 해서 보내기 때문에 원본값에 영향을 미치지 않음
	public static void addNumber(int n) {
		n += 1;
	}
	
	public static void addArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i] += 1;
	}
	
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		System.out.println(p.toString());
		addAge(p);
		System.out.println(p.toString());
		
		int n = 10;
		System.out.println(n);
		addNumber(n);
		System.out.println(n);
		
		int[] arr = {1,2,3,4,5,6};
		addArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}





