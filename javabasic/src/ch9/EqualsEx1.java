package ch9;

public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))	//	value값이 10으로 같아도 equals메서드는 주소값으로 비교하므로 v1과 v2는 다르다.
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		
		
		v2 = v1;		//v2는 v1이 참조하고 있는 인스턴스의 주소 값이 저장되므로, v2도 v1과 같은 주소값이 저장된다.
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value=value;
	}
}
