package ch5;
//예제 5-6
public class ArrayEx6 {

	public static void main(String[] args) {
		int[]score = {79,88,91,33,100,55,95};
		
		int max=score[0]; //max를 배열의 첫번째 값으로 초기화
		int min=score[0]; //min을 배열의 첫번째 값으로 초기화
		
		for(int i=1;i<score.length;i++) { //i=1을 통해 배열의 두번째 값부터 비교
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}
}
