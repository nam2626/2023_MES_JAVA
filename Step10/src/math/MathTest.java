package math;

public class MathTest {

	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(-100));
		
		//올림
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(-3.4));
		
		//내림
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		
		//반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		//큰값, 작은값
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		//삼각함수 -> radian으로 변경해서 수행
		System.out.println(Math.sin(Math.toRadians(45)));
		System.out.println(Math.cos(Math.toRadians(45)));
		System.out.println(Math.tan(Math.toRadians(45)));
		
		//PI
		System.out.println(Math.PI);
	}

}










