package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			int[] arr = null;
//			arr[0] = 100;
			System.out.println(2);
			arr = new int[5];
			arr[5] = 100/0;
			System.out.println(3);
		}catch (ArithmeticException e) {
			System.out.println(4);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(5);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(6);
		}catch (Exception e) {
			//모든 종류의 Exception을 처리할 수 있다.
		}
		System.out.println(7);
	}

}








