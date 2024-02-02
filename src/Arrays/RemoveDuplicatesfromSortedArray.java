package Arrays;

import java.util.*;

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). 

 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Boolean> has = new HashMap<>();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!has.containsKey(nums[i])) {
                has.put(nums[i], true);
                nums[j] = nums[i];
                j++;
            }

        }
        return j;

    }
}
