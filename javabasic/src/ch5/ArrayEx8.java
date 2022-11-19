package ch5;
//예제 5-8
public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball=new int[45]; //길이 45의 배열 ball생성
		
		//배열의 각 요소에 1~45값을 저장한다.
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1; //ball[0]에 1이 저장된다. {1,2,3,4,5,6,7,8,9,10,11,12,...45}
		}
		
		int temp=0; //두 값을 바꾸는데 사용할 임시변수
		int j=0;	//임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꾸서 값을 섞는다.
		//0번째부터 5번쩨 요소까지 모두 6개만 바꾼다. ball[i]와 ball[j]를 서로 바꾼다.
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);//0~44범위의 임의의 값을 얻는다.
			temp = ball[i]; //temp=ball[0]=1
			ball[i] = ball[j]; //ball[0]=ball[난수j위치]=난수 
			ball[j] = temp;//ball[난수j위치]=1;
			
		}
		//배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i=0; i<6; i++) {
			System.out.printf("balll[%d]=%d%n", i, ball[i]);
		}
		

	}

}
