// Last updated: 7/9/2026, 3:13:15 PM
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int level = 0;
        int result = dfs(root, level);
        return result;
    }

    public int dfs(TreeNode root, int level) {
        level++;
        if (root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null) return level;
        
        int left = dfs(root.left, level);
        int right = dfs(root.right, level);
        
        int minLevel = Math.min(left, right);
        return minLevel;
    }
}