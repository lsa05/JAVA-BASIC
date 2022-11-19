package ch5;
//예제 5-11 (p.204)
public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr  = new int[10];
		int[] counter = new int[10]; //{_ _ _ _ _ _ _ _ _ _}
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);	//0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);      // {1 3 9 2 1 8 8 1 3 8} 이라면,
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {//numArr[0]=1, numArr[1]=3, numArr[2]=9, numArr[3]=2, numArr[4]=1, numArr[5]=8, numArr[6]=8, numArr[7]=1, numArr[8]=3, numArr[9]=8 
			counter[numArr[i]]++;			//counter[1]++ counter[3]++ counter[9]++ counter[2]++ counter[1]++ counter[8]++ counter[8]++ counter[1]++ counter[3]++ counter[8]++
			
		} 
		
		for(int i=0; i<numArr.length; i++) {			// counter = {[0] [1] [2] [3] [4] [5] [6] [7] [8] [9]}
			System.out.println(i+"의 개수 : "+counter[i]);//			   0   3   1   2   0   0   0   0   3   1
		}
		

	}

}
