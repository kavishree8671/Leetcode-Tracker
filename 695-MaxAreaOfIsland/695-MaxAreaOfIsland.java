// Last updated: 7/9/2026, 3:09:42 PM
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]== 1 && !vis[i][j]){
                    
                    int area=bfs(i,j,vis,grid);
                    ans=Math.max(ans,area);
                }
            }
        }
        return ans;
    }
    int bfs(int i,int j,boolean[][] vis,int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        vis[i][j]=true;
        int area=0;
        int[][] dir={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            area++;
            for (int k = 0; k < 4; k++) {
                int nextRow = x + dir[k][0];
                int nextCol = y + dir[k][1];
                if (nextRow >= 0 && nextRow < m &&
                    nextCol >= 0 && nextCol < n &&
                    grid[nextRow][nextCol] == 1 &&
                    !vis[nextRow][nextCol]) {
                    vis[nextRow][nextCol] = true;
                    q.offer(new int[]{nextRow, nextCol});
                }
            }
        }
        return area;
    }

}