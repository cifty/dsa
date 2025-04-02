// 2873. Maximum Value of an Ordered Triplet I
// Time complexity = O(n³) because 3 loops O(n*n*n) DISASTER.
// Space complexity = O(1) because no extra data structs are being used beyond the input array.
class Solution {
    public long maximumTripletValue(int[] nums) {
        long answer = 0;
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i + 1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    long calc = (long) (nums[i] - nums[j]) * nums[k];
                    if (calc > answer) { answer = calc; }
                }
            }
        }
        return answer;
    }
}
// Solution = Go through all possible triplets for finding the biggest answer. This is the brute-force way, one day I'll make it better.
