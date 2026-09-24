package com.example.dsa.Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class temperatures
{
	public static void main(String[] args) {

		System.out.println(Arrays.toString(dailyTemperaturesG(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{77,77,77,77,77,41,77,41,41,77})));

    }
	public static int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        
        for(int i=0;i<temperatures.length-1;i++){
            if(temperatures[i+1] > temperatures[i]){
                stack[i] = 1;
            }else{
               int step = 1;
               for(int j=i+1;j<temperatures.length;j++){

                   if(temperatures[i] >= temperatures[j]){
                       if(j==temperatures.length-1){
                           step = 0;
                           break;
                       }
                        step++; 
                   }else{
                       break;
                   }
               }
               stack[i] = step;
            }
        }
        return stack;
    }
    public static int[] dailyTemperaturesG(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // While current temperature is warmer than temperature at stack top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                ans[prevDay] = i - prevDay;
            }
            // Push current day onto stack to wait for its warmer day
            stack.push(i);
        }

        return ans;
    }
}