// 1399. Count Largest Group
// Time complexity O(n log n)
// Space complexity O(1)

class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> groupCounts = new HashMap<>();
        int max = 0;

        for(int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            int count = groupCounts.getOrDefault(digitSum, 0) + 1;
            groupCounts.put(digitSum, count);
            max = Math.max(max, count);
        }

        int result = 0;
        for(int count : groupCounts.values()) {
            if(count == max) {
                result++;
            }
        }
        return result;
    }
    public int getDigitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
}

// Explanation -> Create helper func to calculate digit sum [34 -> 3+4 -> 7]. Go through every number, find digit sum, append to corresponding number from 1-9 and keep count of it with a hash map.
// In the end loop through the hashmap, finding how many key-value pair values are as big as max.
