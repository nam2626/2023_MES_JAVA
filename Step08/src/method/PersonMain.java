package method;

public class PersonMain {

	public static void main(String[] args) {
		//Person 생성
		Person p = new Person("김철수", 22, true);
		p.printPersonInfo();
		p.init("홍길동", 32, true);
		p.printPersonInfo();
		
		Person s = new Person("김영희", 33, false);
		s.printPersonInfo();
	}

}
