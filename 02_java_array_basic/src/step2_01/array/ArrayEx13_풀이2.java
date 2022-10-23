package step2_01.array;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
 * 
 */
//10.18 10:03~10:07
public class ArrayEx13_풀이2 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		
		temp = new int[cnt];
		
		int j = 0; //temp요소
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i]; //arr[i] = temp[j]로 적으면 0 0 0 출력	
								  //오른쪽 값이 왼쪽으로 입력됨
				j++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
	}
	
}
