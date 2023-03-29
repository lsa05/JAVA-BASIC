package ch5;

import java.util.Arrays;

public class ArrayEx4_2 {

	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc); //char배열은 예외적으로 각 요소가 구분자 없이 그대로 출력(주소x)
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		System.out.println();
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		System.out.println();
		
		//배열abc을 배열num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.out.println();
		
		//num의 인덱스6 위치에 abc 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}

}
