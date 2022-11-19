package ch5;
//예제 5-19
public class ArrayEx19 {

	public static void main(String[] args) {
		int[][] score= {//	 kot eng math
							{100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
							,{50,50,50}
						};//3*4배열
		
		//과목별 총점
		int korTotal=0, engTotal=0, mathTotal=0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("===========================");
		
		for(int i=0; i<score.length;i++) { //0~4
			int   sum = 0;		//개인별 총점
			float avg = 0.0f;	//개인별 평균
			
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%3d",i+1); //번호 1 2 3 4 5 
							// 3
			for(int j=0; j<score[i].length;j++) {//0~2
				sum+=score[i][j]; 			//총점 계산 [0][0]+[0][1]+[0][2] 
				System.out.printf("%5d",score[i][j]);	//과목 점수 출력
			}
						//			과목수
			avg=sum/(float)score[i].length; //평균 계산
			System.out.printf("%5d %5.1f%n", sum, avg); //총점, 평균 출력
		}
		System.out.println("=============================");
		System.out.printf("총점: %3d %4d %4d%n",korTotal,engTotal,mathTotal);
	}

}
