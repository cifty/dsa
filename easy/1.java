// 1. Two Sum
// Time complexity = O(n) because of the one loop.
// Space complexity = O(n) because of the hashmap.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (hash.containsKey(ans)) {
                return new int[]{hash.get(ans), i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}

// Solution -> keep track of all the seen numbers with hashmap (Number, its index in the array). The answer can be found via subtraction as were looking for the answer of sum.
