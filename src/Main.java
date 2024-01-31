import Arrays.TwoSum;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 9;
        TwoSum twoSum = new TwoSum();

        System.out.println(
                Arrays.toString(twoSum.twoSumBruitApproch(nums, target)));
    }
}
