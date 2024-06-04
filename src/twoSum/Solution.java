package twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        var i = 0;
        int[] array = new int[2];
        for (int value : nums) {

            var key = target - value;

            if (map.get(key) != null) {
                array[0] = map.get(key);
                map.put(value, i);

                array[1] = i;
            } else {
                map.put(value, i);
                i++;
            }
        }
        return array;
    }
}
