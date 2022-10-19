package step2_01.array;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */

public class ArrayEx11_정답예시 {

	public static void main(String[] args) {
	
		Random ran = new Random(); 
		
		boolean[] isFirst  = new boolean[5]; //boolean타입 isFirst배열 5개 출력
		int[] arr = new int[5];				 //초깃값이 아직 0인 arr배열 5개 출력
		int idx = 0;			// 인덱스 변수 뭐를 위한...?
		
		while (idx < 5) {		// 인덱스가 5개 미만일 때 돌아간다 (0~4) for문으로는 안 되나?
			
			int rNum = ran.nextInt(5);	//랜덤 숫자 5개 (0~4) 출력
			
			if (isFirst[rNum] == false) { //boolean타입 isFirst배열 요소에 랜덤 숫자(0~4)가 false일 때 
				isFirst[rNum] = true;	  //선택되었음을 알릴 수 있게 값을 true로 바꿔준다		
				arr[idx] = rNum;		  //arr배열에 idx 수(턴 수/돌아가는 수)는 랜덤 숫자...?	
				idx++;
			} 
			
		}

		System.out.print("arr : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		
		
	}
	
}
