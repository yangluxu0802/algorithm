package leetcode.统计共同度过的日子数;

/*
* Alice 和 Bob 计划分别去罗马开会。

给你四个字符串 arriveAlice ，leaveAlice ，arriveBob 和 leaveBob 。Alice 会在日期 arriveAlice 到 leaveAlice 之间在城市里（日期为闭区间），而 Bob 在日期 arriveBob 到 leaveBob 之间在城市里（日期为闭区间）。每个字符串都包含 5 个字符，格式为 "MM-DD" ，对应着一个日期的月和日。

请你返回 Alice和 Bob 同时在罗马的天数。

你可以假设所有日期都在 同一个 自然年，而且 不是 闰年。每个月份的天数分别为：[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/count-days-spent-together
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = calculateDayOfYear(arriveAlice);
        int la = calculateDayOfYear(leaveAlice);
        int ab = calculateDayOfYear(arriveBob);
        int lb = calculateDayOfYear(leaveBob);
        if (ab > la || lb < aa) {
            return 0;
        } else {
            return Math.min(la, lb) - Math.max(aa, ab) + 1;
        }
    }

    public int calculateDayOfYear(String day) {
        int[] datesOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        int month = Integer.parseInt(day.substring(0, 2));
        int date = Integer.parseInt(day.substring(3));
        for (int i = month - 1; i > 0; i--) {
            days += datesOfMonths[i];
        }
        return days + date;
    }

    public static void main(String[] args) {
        String arriveAlice = "10-20", leaveAlice = "12-22", arriveBob = "06-21", leaveBob = "07-05";
        System.out.println(new Solution().countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}
