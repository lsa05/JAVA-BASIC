package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();	//key와 value값 모두 출력하여 set에 저장
		Iterator it = set.iterator();	//컬렉션에 저장되어 있는 요소들을 읽어옴
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //Map 형태의 인터페이스를 만드는데 사용, Map을 For 문에서 돌려줄 경우 인터페이스 용도로 사용하거나 혹은 스트림(Stream) 사용 시 Map 형식의 데이터에서 처리가 필요할 때 Map.Entry를 사용하여 처리하게 된다
			System.out.println("이름 : "+e.getKey() + ", 점수 : "+ e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();  //100 100 80 90 -> values
		it = values.iterator(); // 100 100 80 90 ->  values -> it
		
		int total=0;
		
		while(it.hasNext()) { 
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.min(values)); 
	}

}
