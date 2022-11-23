package ch6;
class Data1{
	int value;
//	Data1(){}		//기본생성자-생략가능(클래스에 정의된 생성자가 하나도 없어서 기본생성자가 컴파일러에 의해 자동 추가됨)
}

class Data2{
	int value;
	Data2(){} 		//생성자가 1개 있기 때문에 기본생성자를 추가해야 정상작동(19행 에러)
	
	Data2(int x){	//매개변수가 있는 생성자.
		value=x;	
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2();	//컴파일 에러 발생 -> Data2의 기본생성자 추가해야 함

	}

}
