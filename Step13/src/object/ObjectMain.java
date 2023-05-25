package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = null;
		//메모리 주소값으로 비교
		System.out.println(p1 == p2);
		//Object에서 제공하는 객체 비교하는 메서드
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Dog d1 = new Dog("비숑", 21);
		Dog d2 = new Dog("잡종", 32);
		Dog d3 = new Dog("비숑", 32);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
	}

}











