package ch9;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString()); //toString()을 호출하였는데 클래스 이름과 해시코드가 나오지 않음
		System.out.println(today);
		System.out.println(today.toString());	//이는 String클래스와 Date클래스는 인스턴스가 갖고있는 문자열 or 날짜와 시간을 문자열로 반환하도록 오버라이딩 되어있기 때문이다.

	}

}
