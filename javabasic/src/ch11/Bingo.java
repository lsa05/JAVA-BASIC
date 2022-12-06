package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();
		int [][] board =  new int[5][5]; //5x5배열
		
		for(int i=0; set.size()<25; i++) {
			set.add((int)(Math.random()*50)+1+"");	//1~50까지 난수
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j]=Integer.parseInt((String)it.next());
				System.out.print((board[i][j]<10? "  " : " ")+board[i][j]); //한자리수는 숫자 앞에 공백 넣기
			}
			System.out.println();
		}
	}

}
