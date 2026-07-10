// Last updated: 7/10/2026, 8:46:05 PM
1class Solution {
2    private int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int maxArea = 0;
5        int n = heights.length;
6        int[] arr = new int[n + 1];
7        System.arraycopy(heights, 0, arr, 0, n);
8
9        for (int i = 0; i <= n; i++) {
10            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
11                int h = arr[stack.pop()];
12                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
13                maxArea = Math.max(maxArea, h * w);
14            }
15            stack.push(i);
16        }
17        return maxArea;
18    }
19
20    public int maximalRectangle(char[][] matrix) {
21        if (matrix.length == 0) return 0;
22
23        int cols = matrix[0].length;
24        int[] heights = new int[cols];
25        int ans = 0;
26
27        for (char[] row : matrix) {
28            for (int j = 0; j < cols; j++) {
29                heights[j] = row[j] == '1' ? heights[j] + 1 : 0;
30            }
31            ans = Math.max(ans, largestRectangleArea(heights));
32        }
33        return ans;
34    }
35}