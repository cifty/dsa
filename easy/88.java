// 88. Merge sorted array
// Time complexity -> O(m + n) bc worst case scenario we go through each element from each array.
// Space complexity -> O(1) bc we dont use any extra space, everything goes to nums1.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p3--] = nums2[p2--];
            } else {
                nums1[p3--] = nums1[p1--];
            }
        }
        while (p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }
    }
}

// Solution
// 1. Create pointers to hold last valid number of nums1 (ignores the 0) and nums2. Third pointer will keep track of the last digit of nums1 hence the 0.
// 2. The while loop will compare the numbers from each array and replace it on the 0.
// 3. When one array has gone through, it exits. If nums2 (p2), still has elements, it just gets copied to nums1 as its already sorted non-decreasingly.
