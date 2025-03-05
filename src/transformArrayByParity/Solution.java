package transformArrayByParity;

public class Solution {
    public int[] transformArray(int[] nums) {
        int i;
        int x = 0;
        int y = 0;
        int[] transArray = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        for (i = 0; i < x; i++) {
            transArray[i] = 0;
        }
        for (i = 0; i < y; i++) {
            transArray[i+x] = 1;
        }
        return transArray;
    }
}

