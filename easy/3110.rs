// Absolute diff between ascii values - "zaz" = z (122), a (97) = |122-97| + |97-122| = 25 + 25 = 50.
// Time complexity - O(n) bc one loop runs n-1 times.
// Space complexity - O(1)

impl Solution {
    pub fn score_of_string(s: String) -> i32 {
        let mut score = 0;
        let values = s.as_bytes();
        for i in 0..values.len()-1 {
            score += (values[i] as i32 - values[i+1] as i32).abs()
        }
        score
    }
}

/* In Java

class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length()-1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}

*/
