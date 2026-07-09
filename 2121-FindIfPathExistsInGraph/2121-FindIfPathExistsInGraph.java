// Last updated: 7/9/2026, 3:07:32 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
            int m=edges.length;
            for(int i=0;i<m;i++){
                int sv=edges[i][0];
                int ev=edges[i][1];
                adj.get(sv).add(ev);
                adj.get(ev).add(sv);
            }
    return bfs(n,adj,source,destination);
}
boolean bfs(int n, List<List<Integer>> adj,
        int source, int destination) {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        vis[source] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == destination) {
                return true;
            }
            for (int next : adj.get(node)) {
                if (!vis[next]) {
                    vis[next] = true;
                    q.offer(next);
                }
            }
        }
        return false;
    }
}
