
public class BitOperator {

	public static void main(String[] args) {
		int n1 = 13, n2 = 7;
		// n1 = 0000 0000 0000 0000 0000 0000 0000 1101
		// n2 = 0000 0000 0000 0000 0000 0000 0000 0111
		
		//bit and 연산자 - 둘다 1일때만 1이 되는 연산자
		System.out.println(n1 & n2);//0101 -> 5
		//bit or 연산자 - 둘중에 하나라도 1이면 1이 되는 연산자
		System.out.println(n1 | n2);//1111 -> 15 -> F
	}

}
