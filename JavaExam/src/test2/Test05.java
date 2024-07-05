package test2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) {
				end = mid - 1;
			}else if(arr[mid] < value) {
				start = mid + 1;
			}else {
				loc = mid;
				state = true;
				break;						
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc+1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();
	}
}