package ch5;

import java.util.Arrays;

//예제 5-9
public class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = {-4,-1,3,6,11};//불연속적인 값들로 구성된 배열 code, 길이 5
		int[] arr = new int[10];	//길이 10의 배열 arr
		
		for(int i=0; i<arr.length;i++) {
			int tmp=(int)(Math.random()*code.length);//난수 (0.0~1.0)*5 -> int형이니까 3.5은 3으로 출력, 따라서 0~5까지 난수
			arr[i]=code[tmp]; // arr[0]~[10]에 code[0]~[5]로 채워지는데 code[0]~[5]는 랜덤으로 선택됨, 즉 배열arr에 배열code의 요소들이 랜덤으로 채워짐
		}
		System.out.println(Arrays.toString(arr)); //배열arr의 요소들을 출력

	}

}
