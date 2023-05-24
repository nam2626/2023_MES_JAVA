package inter;

public class TestMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		Eat e = d;
		e.eat();
	}

}
