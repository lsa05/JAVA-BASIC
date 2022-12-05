package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10; i++) {	
			original.add(i+"");	//[0 1 2 3 4 5 6 7 8 9]
		}
		
		Iterator it = original.iterator(); 	//오리지날의 요소를 it객체에 저장
		while(it.hasNext())					//it객체에 다음 요소 있는지 확인
			copy1.add(it.next());			//it객체의 다음요소가 있다면 copy1에 추가(반복문..요소 없을때까지)
			
		System.out.println("= Original에서 copy1로 복사(copy) =");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		it = original.iterator();	//Iterator는 재사용이 안되므로, 다시 얻어와야한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());	//it객체에 저장된 오리지날 요소가 있는지 확인 후 하나씩 copy2에 추가
			it.remove(); 			//오리지날의 요소 삭제
		}
		System.out.println("= Original에서 copy2로 이동(move) =");
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);
	}

}
