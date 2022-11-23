package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0,0,0,0,0};
		int elementCnt = 0;
		
		
		while (true) {
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				if (elementCnt == 5) {
					System.out.println("더 이상 추가할 수 없습니다.");
					continue;
				}
				
				System.out.println("추가할 값 입력: ");
				int add = scan.nextInt();
				
				arr[elementCnt] = add;
				elementCnt++;
			}
			
			else if (sel == 2) {
				
				System.out.print("삭제할 값 입력: ");
				int del = scan.nextInt();
				int delIdx = -1;
				
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == del) {
						delIdx = i;
					}
				}
				
				if (delIdx == -1) {
					System.out.println("입력하신 값이 존재하지 않습니다.");
				}
				else {
					
					int[] temp = arr;
					arr = new int[elementCnt - 1];
					
					for (int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = temp[i+1];
					}
					elementCnt--;
				}	
			}
			else if (sel == 3) {
				System.out.print("값을 넣을 위치 입력: ");
				int idx = scan.nextInt();
				if (idx < 0 || elementCnt < idx) continue;
				
				System.out.println("추가할 값 입력: ");
				int put = scan.nextInt();

				if (elementCnt == 5) {
					System.out.println("더 이상 값을 추가할 수 없습니다.");
				}
				else {
					
					for (int i = elementCnt; i > idx; i++) {
						arr[i] = arr[i-1];
					}
					arr[idx] = put;
					elementCnt++;
				}
				
			}
			
			
		}
		
	}
	
}
