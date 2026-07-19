// Last updated: 7/19/2026, 6:08:37 PM
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
17    public TreeNode buildTree(int[] inorder, int[] postorder) {
18        if (inorder.length == 0 || postorder.length == 0) return null;
19    int ip = inorder.length - 1;
20    int pp = postorder.length - 1;
21    
22    Stack<TreeNode> stack = new Stack<TreeNode>();
23    TreeNode prev = null;
24    TreeNode root = new TreeNode(postorder[pp]);
25    stack.push(root);
26    pp--;
27    
28    while (pp >= 0) {
29        while (!stack.isEmpty() && stack.peek().val == inorder[ip]) {
30            prev = stack.pop();
31            ip--;
32        }
33        TreeNode newNode = new TreeNode(postorder[pp]);
34        if (prev != null) {
35            prev.left = newNode;
36        } else if (!stack.isEmpty()) {
37            TreeNode currTop = stack.peek();
38            currTop.right = newNode;
39        }
40        stack.push(newNode);
41        prev = null;
42        pp--;
43    }
44    
45    return root;
46    }
47}