package ch5;
//예제 5-2
import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] iArr1=new int[10]; //길이 10의 배열
		int[] iArr2=new int[10]; //길이 10의 배열
//		int[] iArr3=new int[] {100,95,80,70,60}; 
		int[] iArr3= {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i]=i+1; //0번지에 1,  ->1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1; //1~10사이의 난수를 배열에 저장 (Math.random()은 0.0~1.0난수)
		}
		
		for(int i=0; i<iArr1.length;i++) {
			System.out.println(iArr1[i]+","); //{1,2,3,4,5,6,7,8,9,10}
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));//{1~10랜덤}
		System.out.println(Arrays.toString(iArr3));//{100,95,80,70,60}
		System.out.println(Arrays.toString(chArr));//{a,b,c,d}
		System.out.println(iArr3);//
		System.out.println(chArr);//abcd //char배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력된다.
	}

}
