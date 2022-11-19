package ch5;
//예제 5-7
public class ArrayEx7 {

	public static void main(String[] args) {
		int[]Arr=new int[10];
		
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=i; //Arr을 0~9의 숫자로 초기화한다.Arr[0]=0, Arr[1]=1, Arr[2]=2...
			System.out.print(Arr[i]);//print ->012345...			
		}
		System.out.println();
		
		//배열 Arr을 무작위로 섞는다.
		for(int i=0; i<100; i++) {	// 배열을 100번 섞음 -> for처리하지 않으면 무한루프
			int n = (int)(Math.random()*10); //0~9중 한 값을 임의로 얻는다. Math.random은 double타입으로 반환->형변환해줌, 난수의 범위가 0.0~1.0사이이므로 10을 곱해서 정수로 만듦
			int tmp = Arr[0]; 
			Arr[0]=Arr[n];
			Arr[n]=tmp;				//Arr[0]과 Arr[n]의 값을 서로 바꾼다.
		}
		
		//섞은 배열을 0번지부터 뽑아내기 
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]);
		}
	}

}
