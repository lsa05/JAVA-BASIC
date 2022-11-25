package ch7;

class PointTest {
	public static void main(String[] args) {
		Point3D p3 =new Point3D(1,2,3);
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
	}
}

class Point2 {
	int x, y;
	Point2(){};	// 기본생성자 써줘야 26행에서 에러가 발생하지 않음
	
	Point2(int x, int y){	//생성자(클래스와 이름이 같음)
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + "," + "y : " + y;
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){	//생성자
		
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	String getLocation() {	//오버라이딩
		return "x : " + x + "," + "y : " + y + "," + "z : "+ z;
	}
	
}

