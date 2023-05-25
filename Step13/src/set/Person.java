package set;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Person hashCode");
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals");
		//메모리 주소가 같으면, 같은 객체
		if(this == obj) return true;
		//1. 받아온 obj가 현재 객체랑 비교할수 있는 타입인지 확인
		//	 instanceof 를 활용하거나, 클래스 패키지명.클래스명으로 확인
		if(obj instanceof Person) {
			//2. 받아온 객체를 형변환
			Person temp = (Person) obj;
			//3. 내부에 있는 값을 비교해서 비교결과를 리턴
			if(this.name.equals(temp.name) && this.age == temp.age)
				return true;			
		}
		return false;
	}
	
	
}









