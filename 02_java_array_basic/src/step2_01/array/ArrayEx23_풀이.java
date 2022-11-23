package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			for (int i = 0; i < accs.length; i++) {
				System.out.print(accs[i] + ":" + pws[i]);
				System.out.println();
			}
			
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) {
				
				if (accsCnt == 5) {
					System.out.println("더 이상 가입할 수 없습니다.");
				}
				
				int check = -1;
				System.out.print("가입할 계좌번호를 입력하세요: ");
				int acc = scan.nextInt();
				
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == acc) {
						check = i;
					}
				}
				
				if (check == -1) {
					System.out.print("비밀번호를 입력하세요: ");
					int pw = scan.nextInt();
					
					accs[accsCnt] = acc;
					pws[accsCnt] = pw;
					accsCnt++;
				}
				else {
					System.out.println("중복된 계좌번호입니다.");
				}
			}
			
			else if (selectMenu == 2) {
				
				System.out.print("삭제할 계좌번호를 입력하세요: ");
				int delAcc = scan.nextInt();
				
				int check = -1;
				for (int i = 0; i < accsCnt; i++) {
					if (accs[i] == delAcc) {
						System.out.print("비밀번호를 입력하세요: ");
						int delPw = scan.nextInt();
						if(pws[i] == delPw) {
							check = i;
						}
					}
				}
				
				if (check == -1) {
					System.out.println("계좌 및 비밀번호를 확인해주세요.");
				}
				else {
					
					for (int i = check; i < accsCnt; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
					
					accs[accsCnt - 1] = 0;
					pws[accsCnt - 1] = 0;
					accsCnt--;
				}
			}
			else if (selectMenu == 3) {
				isRun = false;
			}
			
		}

	}
}
