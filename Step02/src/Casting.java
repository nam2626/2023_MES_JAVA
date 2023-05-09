
public class Casting {
	/*
	 * 	데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 
	 * 		자동으로 형변환
	 * 			- 수의 체계상 작은 개념이 큰 개념과 계산하는 부분에서 자동으로 형변환
	 * 				-> 정수와 실수를 계산했을때 정수가 실수로 형변환 됨
	 * 			- 메모리 바이트수가 작은 타입이 큰타입과 계산할 때 바이트 수가 작은 타입이 큰 타입으로 형변환 됨
	 * 				
	 * 		강제로 데이터 형변환
	 */
	public static void main(String[] args) {
		//자동으로 형변환 되는 경우
		int n = 120;
		double d = n;
		System.out.println(d);
		System.out.println(d / 7);
		
		short s = 1000;//byte short는 자동으로 변환
		System.out.println(s);
		
		long l = 100L;
		System.out.println(l + s);
		
		float f = 3.1415f;
		System.out.println(d + f);
		
		//문자를 계산시 정수형으로 자동으로 형변환
		System.out.println('A' + 1);
		System.out.println('A' + 'B');
		
		
	}

}






