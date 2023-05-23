package instance_of;

public class InstanceOfMain {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p;
		Person s = (Person) a;//큰 개념이 작은 개념이 될떄는 강제로 형변환
		//Dog d = (Dog) a;
		
		//A instanceof B ---> 객체 A가 B클래스 타입으로 형변환이 되냐?
		System.out.println(p instanceof Person);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Person);
		System.out.println(p instanceof Animal);
		
		//클래스 이름 뽑아서 처리
		System.out.println(a.getClass().getName());
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getSimpleName());
		System.out.println(Person.class.getName());
		
	}

}







