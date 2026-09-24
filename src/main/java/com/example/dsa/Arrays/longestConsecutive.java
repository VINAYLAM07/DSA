package com.example.dsa.Arrays;

import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

public class longestConsecutive
{
	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
	}
	public static int longestConsecutive(int[] nums) {
        Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int ans =0;
        for(int i : s){
            if(!s.contains(i-1)){
                int streak=0;
                while(s.contains(i)){
                    streak++;
                    i++;
                }
                ans = Math.max(ans, streak);
            }

        }
        return ans;
    }
}