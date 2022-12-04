package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);	//pq.offer(new Integer(3));오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);//pq내부배열 출력
		
		Object obj = null;
		
		while((obj=pq.poll())!=null)	//PriorityQueue에 저장된 요소를 하나씩 꺼낸다. 
			System.out.println(obj);	//우선순위는 숫자가 작을수록 높은 것이므로 1이 먼저 출력. 
	}

}
