package leetcode.实现strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        int length = needle.length();
        while (index + length <= haystack.length()) {
            String substring = haystack.substring(index, index + length);
            if (substring.equals(needle)) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "a",  needle = "a";
        System.out.println(new Solution().strStr(haystack, needle));
    }
}
