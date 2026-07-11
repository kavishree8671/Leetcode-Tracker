// Last updated: 7/11/2026, 3:01:25 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19        populate(root, result, 0);
20        return result;
21    }
22
23    private void populate(TreeNode root, List<List<Integer>> result, int idx) {
24        if (root == null) {
25            return;
26        }
27
28        List<Integer> arr;
29
30        if (result.size() <= idx) {
31            arr = new ArrayList<>();
32            result.add(arr);
33        } else {
34            arr = result.get(idx);
35        }
36
37        arr.add(root.val);
38
39        populate(root.left, result, idx + 1);
40        populate(root.right, result, idx + 1);
41    
42    }
43}