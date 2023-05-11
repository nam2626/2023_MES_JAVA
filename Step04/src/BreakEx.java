
public class BreakEx {
	/*
	 * 	break 
	 * 		break를 직접 감싸고 있는 반복문 1개만 종료
	 * 		일반적으로 if문과 같이 사용(특정 조건을 만족할 때 종료하기 위해서)
	 */
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while(true) {
			sum += i;
			i++;
			if(sum > 5000)
				break; // sum이 5000 넘는 순간 반복문을 종료
		}
		
		System.out.println(sum);
		
	}

}







