package ch6;
//예제6-25
class Car2 {			//같은 패키지 안에 Car클래스가 있어서 Car2로 변경
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4);	
	}

	Car2(String color) {
		this(color, "auto", 4);
	}
	Car2(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}