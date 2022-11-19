package ch5;
//예제 5-18
public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score= {
							{100,100,100}
						   ,{20,20,20}
						   ,{30,30,30}
						   ,{40,40,40}
						};	 //4행3열 [4][3]
		int sum=0;
		//						4
		for(int i=0; i<score.length; i++) { //0 1 2 3
		//						3	
			for(int j=0; j<score[i].length; j++) { //0 1 2
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		
		for (int[] tmp:score) {//score의 각요소(1차원 배열 주소)를 tmp에 저장
			for(int i:tmp) {	//tmp는 1차원 배열을 가리키는 참조변수
				sum+=i;			//100+100+100+20+20+20+30+30+30+40+40+40
			}
		}
		System.out.println("sum"+sum);
	}
}
