package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size());
		// 가장 일반적인 데이터 검색 방식
		System.out.println("홍길동의 점수: " + map.get("홍길동"));
		// 모든 데이터 찾기
		
		// 1. Entry를 이용하는 방식
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		// 1-1. iterator를 이용하는 방식
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry);
		}
		// 1-2. foreach를 이용하는 방식
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		// 1-3. Set의 forEach 메소드 호출하는 방식
		entrySet.forEach(System.out::println);
		// 2. key를 이용하는 방식
		Set<String> keySet = map.keySet();
		// 2-1. iterator를 이용
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "=" + map.get(key));
		}
		// 2-2. foreach를 이용
		for (String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}
		// map 안의 데이터 확인
		System.out.println(map); // {key=value, key=value}
		// 3. value를 이용하는 방식
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		map.clear(); // 모든 엔트리 삭제
		System.out.println(map.size());
	}
}



