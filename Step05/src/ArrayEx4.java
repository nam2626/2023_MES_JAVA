import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		String str = "Hello World";
		//String으로 저장된 내용을 문자형 배열로 변환해서 리턴
		char[] arr = str.toCharArray();
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		arr[2] = 'F';
		str = new String(arr);//문자형 배열로 문자열을 만듬
		System.out.println(str);
	}

}
