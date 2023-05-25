package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * 	Set
	 * 		1. 데이터를 중복해서 저장 X
	 * 		2. 자동 정렬
	 * 
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("JAVA");
		set.add("Spring");
		set.add("js/jQuery");
		set.add("Android");
		set.add("JAVA");
		
		System.out.println(set);
		
		//데이터 삭제
		System.out.println(set.remove("JAVA"));
		System.out.println(set.remove("JAVA"));
		System.out.println(set);
		
		//데이터 개수 체크
		System.out.println(set.size());
		
		//데이터 검색 - 있는지 체크
		System.out.println(set.contains("Spring"));
		
//		set.clear();
		System.out.println(set.isEmpty());
		
		//전체 조회 1 - 배열로 변환해서 조회
		String[] arr1 = new String[set.size()];
		set.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
	
		//전체 조회 2 - 반복자(Iterator)
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {//다음 위치에 값이 있냐?
			System.out.println(it.next());//다음 위치로 이동해서 값을 리턴
		}
	}

}
















