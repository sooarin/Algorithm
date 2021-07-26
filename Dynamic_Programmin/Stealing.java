package Dynamic_Programmin;

class Stealing {
    public int solution(int[] money) {
        int answer = 0;
        int length = money.length;
        int[] dp = new int[length - 1];
        int[] dp2 = new int[length];

        dp[0] = money[0];
        dp[1] = money[0];
        dp2[0] = 0;
        dp2[1] = money[1];
        for(int i = 2; i<length-1; i++) {
            dp[i] = Math.max(dp[i-2] + money[i], dp[i-1]);
        }
        for(int i = 2; i < length; i++) {
            dp2[i] = Math.max(dp2[i-2] + money[i], dp2[i-1]);
        }
        return Math.max(dp[length-2], dp2[length-1]);
    }
}
