package abstract_ex;
/*
 * 	추상 클래스(Abstract Class)
 * 		- 직접적으로 생성이 되지 않는 클래스
 * 		- 자식 클래스가 생성이 될때만 생성된다.
 * 		- class 앞에 abstract를 추가
 * 		- 일반적으로 최상위 클래스로 존재(최초에 클래스 구조를 잡는 용도로 사용)
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	//추상 메서드를 만들려면 반드시 추상 클래스에서만 작성이 가능
	public abstract void run();
	
}






