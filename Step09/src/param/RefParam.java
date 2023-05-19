package param;

public class RefParam {
	public static void addAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		System.out.println(p.toString());
		addAge(p);
		System.out.println(p.toString());
	}

}
