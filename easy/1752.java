// 1752. Check if Array Is Sorted and Rotated
// Time complexity = O(n) because we go through the array once.
// Space complexity = O(1) because we only use few extra variables.
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[(i + 1) % len]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
// Explanation
// We go through the array looking for "drops" where the next element is smaller than the current one thus the drop. When the array is sorted and rotated, it logically cannot drop more than once.
// Hence for solution, we would count the drops and define the answer from there. nums[i] > nums[(i + 1) % len] this line handles the drop checking of an array WITH a rotation. Without rotation, we would check it like nums[i] > nums[i + 1].
