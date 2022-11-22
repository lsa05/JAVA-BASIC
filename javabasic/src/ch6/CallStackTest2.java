package ch6;
//예제6-8
public class CallStackTest2 {

	public static void main(String[] args) {					//순서
		System.out.println("main(String[] args)이 시작되었음.");	//1
		firstMethod();											//2
		System.out.println("main(String[] args)이 끝났음.");		//8
	}
	
	static void firstMethod() {								
		System.out.println("firstMethod()이 시작되었음.");			//3
		secondMethod();											//4
		System.out.println("firstMethod()이 끝났음.");				//7
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");			//5
		System.out.println("secondMethod()이 끝났음.");			//6
	}

}
