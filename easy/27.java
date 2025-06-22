// Remove elements from array in place.
// Solution - 2 pointers, one for writing other for reading all numbers. If number is the value, it skips it but writing value remains. If it encounters a value we need to keep, it will write to the writing pointer and then writing pointer will get incremented.

class Solution {
    public int removeElement(int[] nums, int val) {
        int p2 = 0, counter = 0;
        for (int p1 = 0; p1 < nums.length; p1++) {
            if(nums[p1] != val) {
                nums[p2] = nums[p1];
                p2++;
                counter++;
            }
        }
        return counter;
    }
}
