// Last updated: 7/10/2026, 9:49:41 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5
6        if (m + n != s3.length()) return false;
7
8        boolean[][] dp = new boolean[m + 1][n + 1];
9        dp[0][0] = true;
10
11        for (int i = 0; i <= m; i++) {
12            for (int j = 0; j <= n; j++) {
13
14                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
15                    dp[i][j] |= dp[i - 1][j];
16                }
17
18                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
19                    dp[i][j] |= dp[i][j - 1];
20                }
21            }
22        }
23
24        return dp[m][n];
25    }
26}