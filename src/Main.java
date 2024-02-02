import Arrays.RemoveDuplicatesfromSortedArray;
import Arrays.TwoSum;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // sc.ne

        int[] nums = { 1, 2, 3, 4, 5, 1, 1, 2 };
        int[] nums1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int target = 9;
        TwoSum twoSum = new TwoSum();

        RemoveDuplicatesfromSortedArray remove = new RemoveDuplicatesfromSortedArray();

        System.out.println(
                Arrays.toString(twoSum.twoSumBruitApproch(nums, target)));

        System.out.println(
                Arrays.toString(twoSum.twoSumBruitApproch(nums, target)));

        System.out.println(remove.removeDuplicates(nums1));
    }

}
