package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] arrClone = arr.clone();	//배열 arr의 클론
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));

	}

}
