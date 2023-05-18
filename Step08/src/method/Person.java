package method;
/*
 * 	메서드는 클래스에서 기능 담당하는 부분
 * 	
 * 	리턴타입 메서드명([매개변수]...){
 * 		
 * 		return 결과값; --> 리턴타입이 void가 아닐때는 반드시 나와야 됨
 * 	}
 * 
 */
public class Person {
	String name;
	int age;
	boolean gender;
	
	public Person() {	}

	//사용자가 직접 생성자를 작성하면, 기본 생성자는 자동으로 생성되지 않음
	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//인적정보 출력하는 기능
	
	
}














