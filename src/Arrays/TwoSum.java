package Arrays;

import java.util.*;

/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

/*
  

Pcodo code 

an array num <-
Int target <-

num[j] = target - nums[i] <-

new int[] { i, j }
 */

public class TwoSum {
    public int[] twoSumBruitApproch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] { i, j };
            }
        }
        return null;
    }

    // Time O(n^2) and space o(n)

    public int[] hasMapsolution(int[] nums, int target) {
        Map<Integer, Integer> hasmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            hasmap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hasmap.containsKey(complement)) {
                return new int[] { hasmap.get(complement), i };
            }
            hasmap.put(nums[i], i);
        }
        return null;
    }
}
// Time o(n) and space o(n)