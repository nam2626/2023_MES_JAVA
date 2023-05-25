package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * 	Map
	 * 		키(Key) 값을 이용해서 데이터(Value)를 저장, 읽기, 삭제, 수정
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("A", 500); //기존값을 지우고 새 값을 저장 - 똑같은 키 값이면 수정
		
		System.out.println(map);
		System.out.println(map.get("C"));//데이터를 꺼낼때도 키값을 이용
		
		map.remove("C");
		System.out.println(map);
		System.out.println(map.get("C"));
		
		//전체 데이터 꺼내기
		Set<String> set = map.keySet(); //저장된 키값을 Set으로 받음
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " - " + map.get(key));
		}
		
		//맵에 저장된 개수
		System.out.println(map.size());
		
		//맵에 해당하는 키값이 있는지?
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("E"));
		
		//맵에 해당하는 값이 있는지?
		System.out.println(map.containsValue(500));
		System.out.println(map.containsValue(700));
		
		//맵 내용 비우기
		map.clear();
		//맵에 내용이 없냐?
		System.out.println(map.isEmpty());
		System.out.println(map);
	}

}














