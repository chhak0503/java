package sub5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        
        // A + B + C 계산
        long result = A + B + C;
        
        // 결과 출력
        System.out.println(result);
    }
}