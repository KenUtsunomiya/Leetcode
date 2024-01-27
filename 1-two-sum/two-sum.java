import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> idxToRest = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (idxToRest.containsKey(target - nums[i])) {
                return new int[]{idxToRest.get(target - nums[i]), i};
            }
            idxToRest.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}