package leetcode.移动零;

public class Solution {

    public void moveZeroes(int[] nums) {
        int cut = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                cut++;
            } else {
                if (cut != 0) {
                    nums[i - cut] = nums[i];
                }
            }
        }
        while (cut != 0) {
            nums[length - 1] = 0;
            length--;
            cut--;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }


    public void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes2(nums);
    }
}
