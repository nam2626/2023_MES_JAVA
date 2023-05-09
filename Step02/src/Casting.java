
public class Casting {
	/*
	 * 	데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 
	 * 		자동으로 형변환
	 * 			- 수의 체계상 작은 개념이 큰 개념과 계산하는 부분에서 자동으로 형변환
	 * 				-> 정수와 실수를 계산했을때 정수가 실수로 형변환 됨
	 * 			- 메모리 바이트수가 작은 타입이 큰타입과 계산할 때 바이트 수가 작은 타입이 큰 타입으로 형변환 됨
	 * 				
	 * 		강제로 데이터 형변환 : 데이터 손실이 일어날 수 있음
	 * 			- 수의 체계상 큰 개념을 작은 개념으로 바꿔야 될때 --->  실수 -> 정수
	 * 			- 메모리 바이트수 큰 타입을 작은 타입으로 바꿔야 될때 --->  double --> float 
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
		
		//강제로 형변환 하는 방법 ---> (변수 타입) 값 or 변수
		double pi = -3.1415;
		int i = (int)pi;
		System.out.println(i);
		System.out.println(pi);
		
		int a = 65;
		System.out.println((char)a);
		System.out.println((char)('A'+1));//결과가 B가 나오게끔 형변환
		
	}

}












