package inter_ex;

/* 인터페이스(Interface)
 * 		클래스 대용품
 * 		기능을 기준으로 묶기위해서 나왔음
 * 		메모리가 직접적으로 할당되지 않음
 * 		전역상수, 추상메서드, 디폴트 메서드 
 * 
 */
public interface InterA {
//	public static final 자동으로 붙음
	final double PI = 3.1415;
//	public static final double PI = 3.1415;
	
	//public abstract도 자동으로 붙음
	public abstract void interA();
	
	//디폴트 메서드 --> jdk8 버전부터 지원
	default double circleArea(double r) {
		return r * r * PI;
	}
}
















