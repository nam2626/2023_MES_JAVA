package abstract_ex;

public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	public abstract void run();
	
}
