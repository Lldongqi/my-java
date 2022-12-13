package com.demo.code;

import java.util.*;


public class Step {

    public static int removeDuplicates(int [] nums){

        if(nums.length == 0){
            return 0;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }


    public static int removeElement(int [] nums,int val){

        int slow = 0;
        int fast = 0;

        while (fast < nums.length ){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;

    }


    public static int [] twoSub(int [] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int temp = nums[left] + nums[right];
            if( temp == target){
                return new int[]{left + 1,right + 1};
            }else if(temp < target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static String palindrome(String s,int left,int right){
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1,right);
    }

    public static String longStr(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {

            String s1 = palindrome(s,i,i);
            String s2 = palindrome(s,i,i+1);

            str = str.length() > s1.length() ? str : s1;
            str = str.length() > s2.length() ? str : s2;

        }
        return str;
    }
}
