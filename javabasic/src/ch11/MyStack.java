package ch11;

import java.util.*;

class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();	//스택에 저장된 마지막 요소를 읽어온다.
		removeElement(size()-1);	//마지막 요소를 삭제. 배열 인덱스가 0부터 시작하므로 1을 빼준다.
		return obj;
	}
	
	public Object peek() {
		int len =size();
		
		if(len==0)
			throw new EmptyStackException();
		return elementAt(len-1);	//마지막 요소를 반환한다. 인덱스가 0부터 시작하므로 1 빼준다. 
	}
	
	public boolean empty() {
		return size()==0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);	//끝에서부터 객체를 찾는다.	
								//q반환값은 저장된 위치(인덱스)이다.
		
		if(i>=0) {//객체를 찾은 경우
			return size()-i; //스택은 맨 위에 저장된 객체의 인덱스를 1로 정의하므로 계산을 통해 정한다.
		}
		
		return - 1;	//객체를 찾지 못하면 -1 반환.
	}
	
	
}
