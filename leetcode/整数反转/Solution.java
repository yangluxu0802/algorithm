package leetcode.整数反转;

/*给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
*/
public class Solution {

    public int reverse(int x) {
        int res = 0;
        int temp;
        while (x != 0) {
            temp = x % 10;
            int newRes = res * 10 + temp;
            if ((newRes - temp) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }
}
