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
	
	
}
