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

public class ArrayEx09_풀이2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char seat[] = { 'X', 'X', 'X', 'X', 'X', 'X', 'X' };
		int total = 0;

		while (true) {
			for (int i = 0; i < seat.length; i++) {
				System.out.print("[" + seat[i] + "] ");
			}
				System.out.println();
				System.out.println("1. 좌석 예매");
				System.out.println("2. 종료");
				int user = scan.nextInt();

			if (user == 1) {
				System.out.println("좌석 선택(1~7): ");
				int choice = scan.nextInt() - 1;

				if (choice < 0 || choice > 6) {
					System.out.println("1~7 좌석 중 선택해주세요.");
				}
				if (seat[choice] == 'X') {
					seat[choice] = 'O';
					total += 12000;
					}
				else {
				System.out.println("이미 예매된 좌석입니다.");
				}
			}
			else if (user == 2) {
				System.out.println("매출액 : " + total +"원");
				break;
			} 
			else {
				System.out.println("1~2중에 선택해 주세요.\n");
			}
		}
		
		scan.close();
	}
}

