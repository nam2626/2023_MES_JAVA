
public class StringType {

	public static void main(String[] args) {
		//문자열 저장 방법 - 1
		String str1 = "Hello World";
		System.out.println(str1);
		
		//문자열 저장 방법 - 2
		String str2 = new String("Hello World");
		System.out.println(str2);
		
		String str3 = str1;
		System.out.println(str3);
		
		//참조형은 메모리 주소값으로 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		
		//문자열 실제 값으로 비교
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		
		//실제 저장된 메모리 주소값
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//new : 메모리를 새로 할당
		String str4 = new String(str2);
		System.out.println(System.identityHashCode(str4));
		
		
	}

}









