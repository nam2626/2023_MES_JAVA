package abstract_ex;

public class Person extends Animal{

	public Person() {
		System.out.println("Person Constructor");
	}
	
	//추상 메서드는 반드시 오버라이딩 해야한다.
	//하지 않을려면 자식도 추상클래스로 작성해야된다.
	@Override
	public void run() {
		System.out.println("사람이 두발로 달립니다.");
	}

}
