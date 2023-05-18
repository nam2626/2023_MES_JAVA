package method;

public class Calcurator {
	int sumCount;
	int minCount;
	int mulCount;
	int divCount;

	public Calcurator() {	}
	
	//정수 숫자 두개를 받아서 더한 결과를 반환하는 기능
	int sum(int n1, int n2) {
		sumCount++;
		return n1 + n2;
	}
	//뺄셈
	int min(int n1, int n2) {
		minCount++;
		return n1 - n2;
	}
	//곱셈
	int mul(int n1, int n2) {
		mulCount++;
		return n1 * n2;
	}
	
	//나눗셈
	int div(int n1, int n2) {
		divCount++;
		return n1 / n2;
	}
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 큰 숫자를 리턴하는 메서드
	int maxNumber(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}
		return n2;
	}
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 작은 숫자를 리턴하는 메서드
	int minNumber(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}
	
	
	//사칙연산 수행한 횟수를 각각 출력 ---> 덧셈 : ? , 뺄셈 : ? , 곱셈 : ? , 나눗셈 : ?
	void printCount() {
		System.out.printf("덧셈 : %d, 뺄셈 : %d, 곱셈 : %d, 나눗셈 : %d\n",
				sumCount, minCount, mulCount, divCount);
	}
}











