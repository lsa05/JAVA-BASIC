package ch9;
final class Card3{
	String kind;
	int num;
	
	Card3(){
		this("SPADE",1);
	}
	
	Card3(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}
public class ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card3 c  = new Card3("HEART", 3);       // new연산자로 객체 생성
		Card3 c2 = Card3.class.newInstance();   // Class객체를 통해서 객체 생성

		Class cObj = c.getClass();

		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());	//패키지와 이름을 호출
		System.out.println(cObj.toGenericString());	//제어자부터 패키지 이름 모두 호출
		System.out.println(cObj.toString());	//클래스의 패키지 이름을 호출	
	}

}
