package leetcode.只出现一次的数字;

public class Solution {

    // 采用异或运算 Time: O(n) Space: O(1)
    // 异或运算 相同数为0 与0运算等于本身
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
}
