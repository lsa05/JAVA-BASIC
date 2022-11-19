package ch5;
//예제5-4
public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc= {'A','B','C','D'}; //길이4
		char[] num= {'0','1','2','3','4','5','6','7','8','9'}; //길이10
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];  //배열 result의 길이= abc의길이+num의 길이
		System.arraycopy(abc, 0, result, 0, abc.length); //abc[0]에서 result[0]으로 abc.length개의 데이터 복사
		System.arraycopy(num, 0, result, abc.length, num.length); //abc.length=4 -> result[4]부터 num.length만큼 복사
		System.out.println(result);
		
		//배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);  //num={A, B, C, D, 4,5,6,7,8,9}
		
		//배열 abc을 배열 num의 인덱스 6의 위치에 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num); //num={A,B,C,D,4,5,A,B,C,9}

	}

}
