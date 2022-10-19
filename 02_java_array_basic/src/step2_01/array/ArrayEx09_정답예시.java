package step2_01.array;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

public class ArrayEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		int getSeat = 0;			//관객이 잡은 자리 변수
		int totalSellingMoney = 0;	//총 매출액 변수
		//선택 변수
		
		
		while (true) {
		
			System.out.println("\n------------- 메가 영화관 ----------\n");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print("[" + seat[i] + "] ");	//전체 자리 보여주기
			}
			System.out.println("\n\n");
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			int operateSignal = scan.nextInt();				//옵션 선택 입력 받기
				
			if (operateSignal == 1) {					//만약 옵션 선택이 1이라면
		
				System.out.println();
				System.out.print("좌석 선택(1~7) : ");	//1~7까지의 좌석 선택을 받고
				getSeat = scan.nextInt()-1;				//0부터 시작하니까 -1 해서 모든 수를 1씩 빼주기
				
				
				if (getSeat < 0 || getSeat >= 7) {		//자리 선택이 1~7에서 벗어났을 때 
					System.out.println("\n1~7까지의 좌석을 선택하여 주십시요.");
					continue;
				}
				
				if (seat[getSeat] == 'X') { 			//seat 배열에 getSeat scan변수에 입력한 값의 요소가 (선택한 자리) 공석 (X)일 때
					seat[getSeat] = 'O';				//예약석 (O)으로 바꾸고
					totalSellingMoney += 12000;			//총 매출액에 12000원 더하기 
				}
				else {
					System.out.println("\n!!!!!이미 예매가 완료된 좌석입니다!!!!!"); //이미 고른 좌석이 O으로 바뀌어 있을 때 출력
				}
				
			
			}
			else if (operateSignal == 2) {
				System.out.println("매출액 : " + totalSellingMoney +"원");
				break;
			} 
			else {
				System.out.println("1~2중에 선택해 주세요.\n");
			}
		}
		
		scan.close();
		
	}
	
}
