package set;

import java.util.HashSet;
import java.util.Iterator;

public class PersonTest {

	public static void main(String[] args) {
		/*
		 * Person을 저장할 HashSet을 생성
		 * Person 객체 4개 생성해서 저장(중복된 내용 1개는 포함)
		 * Iterator 이용해서 전체 조회
		 */
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("김철수", 20));
		set.add(new Person("홍길동", 30));
		set.add(new Person("박문수", 40));
		set.add(new Person("김철수", 20));
		
		System.out.println(set.size());
		
		Iterator<Person> it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}











