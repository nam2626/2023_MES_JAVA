package abstract_ex;

public class AbstractMain {

	public static void main(String[] args) {
//		추상 클래스는 직접적으로 생성 X
//		Animal animal = new Animal();
		
		//추상 클래스도 데이터 타입. 자식클래스를 형변환 시켜서 저장
		Animal a = new Person();
		a.eat();
		a.run();
	}

}
