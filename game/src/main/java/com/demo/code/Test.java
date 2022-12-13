package com.demo.code;



import com.demo.controller.User;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        Integer[] a = {1,2,3};
        Integer[] b= {4,3,5};

        System.out.println(Objects.equals(1,2));

    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return Math.max(leftMax,rightMax) + 1;
    }
    public static int maxSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = Math.max(0,maxSum(root.left));
        int rightMax = Math.max(0,maxSum(root.right));
        return root.val + Math.max(leftMax,rightMax);
    }

    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        int dept = 1;
        linkedList.add(root);

        while (!linkedList.isEmpty()){
            int size = linkedList.size();

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = linkedList.poll();
                if(treeNode.left == null && treeNode.right == null){
                    return dept;
                }
                if(treeNode.left != null){
                    linkedList.add(treeNode.left);
                }
                if(treeNode.right != null){
                    linkedList.add(treeNode.right);
                }
            }
            dept++;
        }
        return dept;
    }

    public static double findMiddle(Integer [] num1,Integer[] num2){
        String[] first = { "a", "b", "c", "d" };
        String[] after = { "d", "e", "f", "g" };
        Stream<Integer> firstStream = Stream.of(num1);
        Stream<Integer> afterStream = Stream.of(num2);
        //合并两个流并去重
        List<Integer> concat = Stream.concat(firstStream, afterStream).collect(Collectors.toList());

        System.out.println(concat);



//        int len = nums.length;
//        if(len % 2 == 0){
//            double result = (nums[len / 2] + nums[(len / 2) -1]) /2;
//            return result;
//        }
//        double result = nums[len / 2];
//        return  result;
        return 123;

    }

    public int maxSub(int [] nums){
        int length = nums.length;
        int dp_0 = nums[0];
        int res = dp_0;
        int de_1 = 0;
        for (int i = 1; i < length; i++) {
            de_1 = Math.max(nums[i],dp_0 + nums[i]);
            dp_0 = de_1;
            res = Math.max(res,de_1);
        }
        return res;
    }


    public static List<String> letters(String digits){
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }

        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        StringBuilder stringBuilder = new StringBuilder();
        dfs(stringBuilder,hashMap,digits,0,res);
        return res;
    }

    public static void dfs(StringBuilder path,
                                   Map<Character, String> map,
                                   String digits,int dept,List<String> res){
        if(dept == digits.length()){
            res.add(path.toString());
        }else{
            char digit = digits.charAt(dept);
            String str = map.get(digit);
            int len = str.length();
            for (int i = 0; i < len; i++) {
                path.append(str.charAt(i));
                dfs(path,map,digits,dept + 1,res);
                path.deleteCharAt(dept);
            }
        }
    }
    
    public static ListNode mergeKLists(ListNode [] listNodes){
        if(listNodes.length == 0){
            return null;
        }
        ListNode pre = new ListNode(-1);
        ListNode current = pre;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(listNodes.length, Comparator.comparingInt(a -> a.val));
        for (ListNode listNode : listNodes) {
            priorityQueue.add(listNode);
        }
        while (!priorityQueue.isEmpty()){
            ListNode poll = priorityQueue.poll();
            current.next = poll;
            if(poll.next != null){
                priorityQueue.add(poll.next);
            }
            current = current.next;
        }
        return pre.next;
    }

    public static ListNode mergeTwoList(ListNode listNode1,ListNode listNode2){

        ListNode pre = new ListNode(0);
        ListNode current = pre;
        ListNode list1 = listNode1;
        ListNode list2 = listNode2;
        while (list1 != null && list2 != null){
            if( list1.val <= list2.val ){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;

        }
        if(list1 != null){
            current.next = list1;
        }

        if(list2 != null){
            current.next = list2;
        }

        return pre.next;

    }

    public static int maxArea(int [] height){
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right){
            res = height[left] < height[right] ?
                    Math.max(res,(right - left) * height[left++]) :
                    Math.max(res,(right - left) * height[right--]);
        }
        return res;
    }


    public static String longestPalindrome(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String str1 = palindrome(str,i,i);
            String str2 = palindrome(str,i,i+1);
            res = str1.length() > res.length() ? str1 : res;
            res = str2.length() > res.length() ? str2 : res;

        }
        return res;
    }

    public static String palindrome(String str,int left,int right){
        while (left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }

    public static int longStr(String str){
        int left = 0;
        int right = 0;
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (right < str.length() ){
            char c = str.charAt(right);
            right++;
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c) + 1);
            }else{
                hashMap.put(c,1);
            }
            while (hashMap.get(c) > 1){
                char d = str.charAt(left);
                left++;
                hashMap.put(d,hashMap.get(d)-1);
            }
            res = Math.max(res,right - left);
        }
        return res;
    }

    public static ListNode newList(ListNode listNode1,ListNode listNode2){
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;
        int temp = 0;
        while (listNode1 != null || listNode2 != null){
            int l1 = listNode1 != null ? listNode1.val : 0;
            int l2 = listNode2 != null ? listNode2.val : 0;
            int sum =  l1 + l2 + temp;
            int num;
            if(sum > 10){
                num = sum % 10;
                temp = 1;
            }else{
                num = sum;
                temp = 0;
            }
            current.next = new ListNode(num);
            current = current.next;
            if(listNode1 != null){
                listNode1  = listNode1.next;
            }
            if(listNode2 != null){
                listNode2  = listNode2.next;
            }
        }
        if(temp == 1){
            current.next = new ListNode(1);
        }
        return listNode.next;
    }

}


class Data{
    public synchronized static void method1() {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1....");
    }
    public synchronized static void method2() {
        System.out.println("2....");
    }
}

class Data2{
    public void method (Integer num){
        synchronized (num){
            System.out.println("start....");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
            }
            System.out.println("end....");
        }

    }
}
