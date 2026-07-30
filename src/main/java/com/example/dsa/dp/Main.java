package com.example.dsa.dp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        HashSet<String> dict = new HashSet<>();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            dict.add(word);
            maxLen = Math.max(maxLen, word.length());
        }

        int m = s.length();
        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[m] = -1;

        for (int i = m - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < m && j < i + maxLen; j++) {
                sb.append(s.charAt(j));

                if (dict.contains(sb.toString()) && dp[j + 1] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j + 1] + 1);
                }
            }
        }

        System.out.println(dp[0] == Integer.MAX_VALUE ? -1 : dp[0]);
    }
}