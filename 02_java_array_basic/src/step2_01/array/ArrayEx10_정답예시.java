package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

public class ArrayEx10_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1   = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2   = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3   = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel        = 0;				//옵션 선택
		
		while (true) {				//프로그램이 다 돌을 때까지 실행
			
			boolean isWin = false;	// 당첨 변수 -> 당첨이 되었을 때 구분하기 위하여 우선 false 입력
			int cnt       = 0;		// 7이 나왔을 때의 카운트
									//위 두 줄이 while문 안에 있어야하는 이유: 둘 다 한 번 입력되는 값이 유지되면 안 되고
									//프로그램이 종료될 때까지 계속해서 돌아야되기 때문
									//밖에 꺼내두니 lotto2의 값이 처음엔 꽝으로 제대로 나왔지만 다른 로또 당첨 후에는 당첨으로 저장되어 계속 당첨 출력
			
			
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();	//옵션 선택 스캔 변수
								
			if ( sel == 1 ) {		//만약 1을 입력했을 때
				for (int i = 0; i < lotto1.length; i++) {
					if (lotto1[i] == 7) {	// lotto1 배열의 요소가 7일 때
						cnt++;				// 카운트 수가 1 올라간다.
						if (cnt == 3) {isWin = true;}	//카운트 수가 총 3이 되었을 때, 당첨 변수 값에 true 입력
					} 
					else {
						cnt = 0;			// 카운트 수가 3이 아닐 땐 0
					}
				}
			}
			else if ( sel == 2 ) { 	//만약 2를 입력했을 때
				for (int i = 0; i < lotto2.length; i++) {	// lotto2 배열의 요소가 7일 때
					if (lotto2[i] == 7) {
						cnt++;								// 카운트 수가 1 올라간다.
						if (cnt == 3) isWin = true;			//카운트 수가 총 3이 되었을 때, 당첨 변수 값에 true 입력
					} 
					else {
						cnt = 0;
					}
				}
			}
			else if ( sel == 3 ) {
				for (int i = 0; i < lotto3.length; i++) {	
					if (lotto3[i] == 7) {					// lotto3 배열의 요소가 7일 때
						cnt++;								// 카운트 수가 1 올라간다.
						if (cnt == 3) isWin = true;			// 카운트 수가 총 3이 되었을 때, 당첨 변수 값에 true 입력
					} 
					else {
						cnt = 0;
					}
				}
			}
			else if ( sel == 0 ) break;				//만약 0을 입력했을 때는 프로그램 종료 
			else                 continue;			//그 외에를 입력했을 때는 처음부터 프로그램 다시 실행
			
			
			if (isWin) 		System.out.println("\n당첨"); //true일 때만 실행이 되니 변수에 true를 입력하고 당첨됐을 때의 문구에 true를 입력한 변수를 출력시킨다.
			else 			System.out.println("\n꽝");	  //나머지는 꽝
			
		}
		
		scan.close();
		
	}
}


// 참고) 배열의 주소값 대입
//public class ArrayEx10_정답 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[] lotto1   = {0, 0, 7, 7, 7, 0, 0, 0};
//		int[] lotto2   = {7, 0, 7, 7, 0, 0, 0, 0};
//		int[] lotto3   = {7, 0, 7, 7, 7, 0, 7, 0};
//		int[] target   = new int [7];
//		int sel        = 0;
//		
//		while (true) {
//			
//			boolean isWin = false;
//			int cnt       = 0;
//			
//			System.out.println("\n[1]번복권 결과확인");
//			System.out.println("[2]번복권 결과확인");
//			System.out.println("[3]번복권 결과확인");
//			System.out.println("[0]종료");
//			System.out.print("메뉴 선택 : ");
//			sel = scan.nextInt();
//								
//			if      ( sel == 1 ) target = lotto1;	// 배열의 주소 대입
//			else if ( sel == 2 ) target = lotto2;
//			else if ( sel == 3 ) target = lotto3;
//			else if ( sel == 0 ) break;
//			else                 continue;
//			
//			for (int i=0; i<8; i++) {
//				if (target[i] == 7) {
//					cnt++;
//					if (cnt == 3) isWin = true;
//				} 
//				else {
//					cnt = 0;
//				}
//			}
//			
//			if (isWin) 		System.out.println("\n당첨");
//			else 			System.out.println("\n꽝");
//			
//		}
//		
//		scan.close();
//		
//	}
//}



