package transformArrayByParity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4,3,2,1};
        int[] nums2 = {1,5,1,4,2};
        System.out.println(Arrays.toString(solution.transformArray(nums1)));
        System.out.println(Arrays.toString(solution.transformArray(nums2)));
    }
}
