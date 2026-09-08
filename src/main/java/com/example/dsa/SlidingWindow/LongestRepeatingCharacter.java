package com.example.dsa.SlidingWindow;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            frequency[index]++;
            maxFrequency = Math.max(maxFrequency, frequency[index]);
            int windowLength = right - left + 1;
            int lettersToChange = windowLength - maxFrequency;

            while (lettersToChange > k) {
                int leftIndex = s.charAt(left) - 'A';
                frequency[leftIndex]--;
                left++;
                windowLength = right - left + 1;
                lettersToChange = windowLength - maxFrequency;
            }
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }
}