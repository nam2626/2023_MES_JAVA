
public class Operator3 {
	/*
	 * 	증감 연산자 : 변수의 값을 1씩 증가, 감소하는 연산자
	 * 				= 이 없어도 값을 변경시켜서 저장하는 연산자
	 * 
	 * 			num++	++num	num--	--num
	 * 	 	
	 * 		전위형	++num, --num  num이 속한 연산을 하기전에 증가
	 * 		후위형	num++, num--  num이 속한 연산을 한 후에 증가
	 */
	public static void main(String[] args) {
		//정수형 변수 두개 선언해서 동일한 값으로 초기화
		int n1, n2;
		n1 = n2 = 10;
		
		System.out.println(n1);//10
		System.out.println(n1++);//10
		System.out.println(n1);//11
		System.out.println();
		System.out.println(n2);//10
		System.out.println(++n2);//11
		System.out.println(n2);//11
	}

}






