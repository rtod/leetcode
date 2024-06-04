package medianOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedArray = new ArrayList<>();
        double s;
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                mergedArray.add(nums1[i]);
                i++;
            } else {
                mergedArray.add(nums2[j]);
                j++;
            }
        }


        while (i < n) {
            mergedArray.add(nums1[i]);
            i++;
        }

        while (j < m) {
            mergedArray.add(nums2[j]);
            j++;
        }


        int a = mergedArray.size();
        if (a % 2 == 0) {
            s = ((double) mergedArray.get(a / 2 - 1) + (double) mergedArray.get(a / 2)) / 2;
        } else {
            s = mergedArray.get(a / 2);
        }

        return s;
    }
}
