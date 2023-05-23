package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * String 타입은 문자열 상수로 저장하기 떄문에
		 * 문자열을 가지고 값을 변경하는 작업을 수행하면
		 * 매번 새롭게 메모리를 생성해서 결과값을 리턴
		 */
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		str = str.replace("l", "a");
		System.out.println(System.identityHashCode(str));
		str += 10;
		System.out.println(System.identityHashCode(str));
		
		StringBuilder strbBuilder = new StringBuilder("Hello");
		System.out.println(strbBuilder + " " + System.identityHashCode(strbBuilder));
		strbBuilder.append(100);
		System.out.println(strbBuilder + " " + System.identityHashCode(strbBuilder));
		//start는 포함, end는 포함하지 않음
		strbBuilder.replace(0, strbBuilder.length(), "test");
		System.out.println(strbBuilder + " " + System.identityHashCode(strbBuilder));
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer + " " + System.identityHashCode(buffer));
		buffer.append(100);
		System.out.println(buffer + " " + System.identityHashCode(buffer));
	}

}









