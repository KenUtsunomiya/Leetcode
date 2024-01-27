import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> idxToRest = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (idxToRest.containsKey(target - nums[i])) {
                result[0] = idxToRest.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            idxToRest.put(nums[i], i);
        }
        return result;
    }
}