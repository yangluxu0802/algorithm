package leetcode.有效的字母异位词;

/*
*
* 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

作者：LeetCode
链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn96us/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int cnt[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i) - 'a']--;
        }

        for (int i : cnt) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
