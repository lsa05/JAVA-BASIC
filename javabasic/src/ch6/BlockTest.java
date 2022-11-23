package ch6;
//예제 6-27
class BlockTest {
	static {
		System.out.println("static { }"); 	//1. 클래스 초기화 블럭(static{})이 가장 먼저 실행 -> 그 다음 메인메소드 실행
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {					
		System.out.println("생성자");			
	}
	
	public static void main(String[] args) {					//2. 메인메소드 실행
		System.out.println("BlockTest bt = new BlockTest();");	
		BlockTest bt=new BlockTest();	
		
		System.out.println("BlockTest bt2 = new BlockTest();");	
		BlockTest bt2=new BlockTest();							

	}

}
