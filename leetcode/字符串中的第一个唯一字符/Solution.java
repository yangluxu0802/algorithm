package leetcode.字符串中的第一个唯一字符;

public class Solution {

    public int firstUniqChar(String s) {
        int length = s.length();
        int[] count = new int[26];
        for (int i = 0; i < length; i++) {
            count[s.charAt(i) - 'a']++;
        }
        //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
        for (int i = 0; i < s.length(); i++){
            if (count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
