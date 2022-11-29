package ch9;
class Point implements Cloneable{ //Cloneable인터페이스 구현
	int x, y;
	
	Point(int x, int y){	//생성자
		this.x=x;
		this.y=y;
	}
	
	public String toString() {	//오버라이딩
		return "x=" + x+ ", y=" + y; 
	}
	
	public Object clone() {	//접근제어자를 protected에서 public으로 변경
		Object obj = null;
		try {
			obj = super.clone();	//try-catch내에서 조상클래스의 clone()을 호출
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); //복제(clone)해서 새로운 객체 생성
		System.out.println(original);
		System.out.println(copy);
	}

}
