package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//작업 영역
			System.out.println(1);
			System.out.println(5/3);
			System.out.println(2);
		}catch(Exception e) {
			//Exception이 발생 했을때 처리하는 영역
			System.out.println(3);
		}
		System.out.println(4);
	}

}
