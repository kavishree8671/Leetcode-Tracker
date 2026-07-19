// Last updated: 7/19/2026, 5:57:45 PM
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
17    public boolean isValidBST(TreeNode root) {
18        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20
21    private boolean isValid(TreeNode node, long min, long max) {
22        if(node == null){
23            return true;
24        }
25
26        if(node.val <= min || node.val >= max){
27            return false;
28        }
29
30        return isValid(node.left, min, node.val) &&
31               isValid(node.right, node.val, max);
32    }
33}