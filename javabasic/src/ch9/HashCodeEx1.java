package ch9;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());	//String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 hashCode()가 오버라이딩 되어 있음
		System.out.println(str2.hashCode());	//hashCode()는 Object클래스에 정의된 것이므로 인스턴스 생성없이 바로 호출 가능
		
		System.out.println(System.identityHashCode(str1));	//객체의 주소값으로 해시코드를 생성하므로 모든 객체에 대해 항상 다른 해시코드값을 반환
		System.out.println(System.identityHashCode(str2));	// 즉, str1과 str2는 해시코드는 같지만 서로 다른 객체

	}

}
