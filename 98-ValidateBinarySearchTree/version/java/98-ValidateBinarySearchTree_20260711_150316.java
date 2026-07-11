// Last updated: 7/11/2026, 3:03:16 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int maxDepth(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21        
22        int leftDepth = maxDepth(root.left);
23        int rightDepth = maxDepth(root.right);
24        return 1+Math.max(leftDepth,rightDepth);
25    }
26}