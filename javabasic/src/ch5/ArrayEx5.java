package ch5;
//예제 5-5
public class ArrayEx5 {

	public static void main(String[] args) {
		int sum=0;
		float avg=0f;
		
		int[]score= {100,88,100,100,90}; //길이 5
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i]; //100+88+100+100+90
		}
		
		avg=sum/(float)score.length; //길이=과목 수, float으로 형변환
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
