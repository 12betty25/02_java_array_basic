package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_2_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
//		int[] d = { 10,20,30,40,50 };
//		int[] e = { 0,0,0,0,0 };
//		// 예) 30 ==> e = {10,20,40,50,0};
//
//		System.out.print("뺄 값 입력: ");
//		int num = scan.nextInt();
//		
//		int j = 0;
//		for (int i = 0; i < e.length; i++) {
//			if (d[i] == num) {
//				j = i;
//			}
//		}
//		
//		for (int i = 0; i < j; i++) {
//			e[i] = d[i];
//		}
//		
//		for (int i = j; i < e.length - 1; i++) {
//			e[i] = d[i+1];
//		}
//		
//		for (int i = 0; i < e.length; i++) {
//			System.out.print(e[i] + " ");
//		}
//		System.out.println();
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
//	
//		System.out.print("뺄 번호 입력: ");
//		int delNum = scan.nextInt();
//		
//		int k = 0;
//		for (int i = 0; i < g.length; i++) {
//			if (f[i] == delNum) {
//				k = i;
//			}
//		}
//		
//		for (int i = 0; i < k; i++) {
//			g[i] = f[i];
//			}
//		for (int i = k; i < f.length-2; i++) {
//			g[i] = f[i+2];
//		}
//		
//		for (int i = 0; i < g.length; i++) {
//			System.out.print(g[i] + " ");
//		}
//		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
//		int[] h = { 10,20,30,40,50 };
//		// 예)  60 ==> {20,30,40,50,60};
//		
//		System.out.print("추가 번호 입력: ");
//		int addNum = scan.nextInt();
//		
//		for (int i = 0; i < h.length-1; i++) {
//			h[i] = h[i+1];
//		}
//		h[h.length-1] = addNum;
//		
//		for (int i = 0; i < h.length; i++) {
//			System.out.print(h[i] + " ");
//		}
//		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
//		int[] i = { 10,20,30,40,50 };
//		 //예) 60 ==> {60,10,20,30,40};
//		System.out.print("추가 번호 입력: ");
//		int numAdd = scan.nextInt();
//		
//		for (int j = i.length - 2; j >= 0; j--) {
//			i[j+1] = i[j];
//		}
//		i[0] = numAdd;
//		
//		for (int j = 0; j < i.length; j++) {
//			System.out.print(i[j] + " ");
//		}
//		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] arr1 = { 1,2,3,4,5 };
		int[] arr2 = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		
		for (int j = arr1.length - 1; j >= 0; j--) {
			for (int j2 = 0; j2 < arr2.length; j2++) {
				arr2[j2] = arr1[j];
			}
		}
       
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		
		
		
	}

}
