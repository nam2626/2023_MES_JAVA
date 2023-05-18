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
	
	//사용자 정보를 초기화 하는 메서드 - 이름, 나이, 성별을 받아서 필드에 저장
	void init(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//인적정보 출력하는 기능 -> 이름 나이 남자/여자
	void printPersonInfo() {
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	}
	
}














