package com.demo.code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class NumberArray {
    private int[] preSum;

    public NumberArray(int [] nums){

        preSum = new int[nums.length+1];

        for (int i = 1; i < preSum.length; i++) {

            preSum[i] = preSum[i -1] + nums[i -1];

        }
    }

    public int subRange(int left,int right){

        return preSum[right + 1] - preSum[left];
    }


    public static int subArraySub(int [] nums,int k){
        int res = 0;
        int n = nums.length;
        int [] preNum = new int[n+1];
        preNum[0] = 0;
        for (int i = 0; i < n; i++) {
            preNum[i+1] = preNum[i] + nums[i];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(preNum[i] - preNum[j] == k){
                   res++;
                }
                
            }
        }
        return res;
    }

    public static int subArraySub1(int [] nums,int k){
        int n = nums.length;
        int res = 0;
        int sub = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            res = 0;
            for (int j = i; j < n ; j++) {
                res += nums[j];
                if(res == k){
                    sub++;
                }
            }
        }
        return sub;
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // map：前缀和 -> 该前缀和出现的次数
        HashMap<Integer, Integer>
                preSum = new HashMap<>();
        // base case
        preSum.put(0, 1);

        int res = 0, sum0_i = 0;
        for (int i = 0; i < n; i++) {
            sum0_i += nums[i];
            // 这是我们想找的前缀和 nums[0..j]
            int sum0_j = sum0_i - k;
            // 如果前面有这个前缀和，则直接更新答案
            if (preSum.containsKey(sum0_j))
                res += preSum.get(sum0_j);
            // 把前缀和 nums[0..i] 加入并记录出现次数
            preSum.put(sum0_i,
                    preSum.getOrDefault(sum0_i, 0) + 1);
        }
        return res;
    }
}
