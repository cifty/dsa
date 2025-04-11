// 2843. Count Symmetric Integers
// Time complexity O(n)
// Space complexity O(1)


class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                int half = s.length() / 2;
                int leftSum = 0, rightSum = 0;
                for (int j = 0; j < half; j++) {
                    leftSum += s.charAt(j) - '0';
                    rightSum += s.charAt(j + half) - '0';
                }
                if (leftSum == rightSum) count++;
            }
        }
        return count;
    }
}

// Solution -> Go through all the numbers from low to high. Convert it into a string and calculate both halves. Funny trick with char in Java comes that when you want to convert
// an char value to integer easily, just subtract '0' from the char value as the ascii of it will turn it into integer.
