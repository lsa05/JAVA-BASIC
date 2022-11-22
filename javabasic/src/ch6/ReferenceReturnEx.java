package ch6;
//예제6-14
public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		
		Data d2= copy(d); 		//copy메서드가 종료되면서 반환한 tmp의 값이 참조변수 d2에 저장된다.
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);

	}
	
	static Data copy(Data d) { 	//copy 메서드, 반환타입이 Data (Data객체의 주소를 반환하므로)
		Data tmp =new Data(); 	//새로운 객체 tmp를 생성한다.
		tmp.x=d.x;				//d.x의 값을 tmp.x에 복사한다.
		
		return tmp;				//복사한 객체의 주소를 반환한다.
	}

}
