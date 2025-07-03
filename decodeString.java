class Solution {
    public String decodeString(String s) {
       if (s == null || s.length() == 0) return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == '0') {
                dp[i] = 0;
            } else {
                dp[i] = dp[i - 1];

                if (i >= 2 && s.charAt(i - 2) == '[' && s.charAt(i - 1) <= '9') {
                    int repeat = Integer.parseInt(s.substring(i - 2, i));

                    for (int j = i - repeat * 2; j < i - 2; j++) {
                        dp[i] += dp[j];
                    }
                }
            }
        }

        return dp[s.length()];
    }
}