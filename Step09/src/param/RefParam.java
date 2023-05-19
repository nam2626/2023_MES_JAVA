package param;

public class RefParam {
	//Call by Reference - 참조에 의한 호출 ---> 메모리 주소값이 전달
	public static void addAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	//Call by Value
	public static void addNumber(int n) {
		n += 1;
	}
	
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		System.out.println(p.toString());
		addAge(p);
		System.out.println(p.toString());
		
		int n = 10;
		System.out.println(n);
		addNumber(n);
		System.out.println(n);
		
	}

}





