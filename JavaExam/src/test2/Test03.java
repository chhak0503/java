package test2;

public class Test03 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 현재 배열 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+", ");
		}

		System.out.print("\n");

		// 배열의 원소를 역순으로 정렬
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9 - j] = temp;
		}

		// 역순으로 정렬된 배열 출력
		for (int n : arr) {			
			System.out.print(n+", ");
		}
	}
}