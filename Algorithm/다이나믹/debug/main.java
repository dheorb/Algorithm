import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 테스트 케이스 개수 입력
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        // 2. DP 테이블 미리 계산 (n은 보통 11 미만이므로 여유있게 12 할당)
        // 이렇게 하면 작은 입력값(1, 2)이 들어와도 에러가 나지 않습니다.
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 4; i < 12; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 3. 입력받은 각 케이스에 대해 즉시 출력
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
        
        sc.close();
    }
}