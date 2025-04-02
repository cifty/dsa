// 26. Remove Duplicates from Sorted Array
// Time complexity = O(n) because we go through the array once.
// Space complexity = O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p1] != nums[p2]) {
                nums[++p1] = nums[p2];
            }
        }
        return p1+1;
    }
}
// Solution = 2 pointer approach where the first pointer keeps track of unique element while second one goes through all other elements, looking for the next unique one.
// When finding a unique one, the element after first pointer is swapped. 
