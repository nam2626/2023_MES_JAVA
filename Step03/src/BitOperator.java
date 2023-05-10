
public class BitOperator {

	public static void main(String[] args) {
		int n1 = 13, n2 = 7;
		// n1 = 0000 0000 0000 0000 0000 0000 0000 1101
		// n2 = 0000 0000 0000 0000 0000 0000 0000 0111
		
		//bit and 연산자 - 둘다 1일때만 1이 되는 연산자
		System.out.println(n1 & n2);//0101 -> 5
		//bit or 연산자 - 둘중에 하나라도 1이면 1이 되는 연산자
		System.out.println(n1 | n2);//1111 -> 15 -> F
		//bit xor 연산자 - 서로 값이 다를때만 1
		System.out.println(n1 ^ n2);//1010 -> 10 -> A
		//bit not 연산자 - 1과 0을 뒤집음
		// n1 = 1111 1111 1111 1111 1111 1111 1111 0010
		//      1000 0000 0000 0000 0000 0000 0000 1110
		System.out.println(~n1);//-14
		
		//l-shift operator
		System.out.println(n1 << 1);//26
		System.out.println(n1 << 2);//52		
		System.out.println(n1 << 3);//104
		
		//r-shift operator
		System.out.println(n1 >> 1);//6
		System.out.println(n1 >> 2);//3		
		System.out.println(n1 >> 3);//1
		
	}

}











