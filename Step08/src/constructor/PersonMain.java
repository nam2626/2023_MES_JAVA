package constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.name + " " + p.age);
		
		Person s = new Person("김철수", 30);
		System.out.println(s.name + " " + s.age);
		
		Person d = new Person("이영희");
		System.out.println(d.name + " " + d.age);
		
	}

}
