package final_ex;

public class Animal {
	private final int age; //이럴 경우 반드시 생성자에서 초기화가 필요

	public Animal(int age) {
		super();
		this.age = age;
	}
	
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
}
