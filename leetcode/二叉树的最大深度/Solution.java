package leetcode.二叉树的最大深度;

public class Solution {


    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode5 = new TreeNode();
        treeNode1.val = 3;
        treeNode2.val = 9;
        treeNode3.val = 20;
        treeNode4.val = 15;
        treeNode5.val = 7;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
//        treeNode3.left = treeNode4;
//        treeNode3.right = treeNode5;
        new Solution().maxDepth(treeNode1);
    }
}
