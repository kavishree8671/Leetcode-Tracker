// Last updated: 7/10/2026, 9:23:07 PM
1class Solution {
2    public boolean circularArrayLoop(int[] nums) {
3        int n = nums.length;
4        boolean[] vs = new boolean[n];
5        for (int i = 0; i < n; i++) {
6            if (bfs(nums, n, i, vs)) return true;
7        }
8        return false;
9    }
10    
11    private boolean bfs(int[] nums, int n, int i, boolean[] vs) {
12        if (vs[i]) return false;
13        int len = 0, j = i, cnt = 0;
14        Map<Integer, Integer> cnts = new HashMap<>();
15        boolean forward = nums[i] > 0, res = true;
16        Set<Integer> visited = new HashSet<>();
17        while (!cnts.containsKey(i)) {
18            cnts.put(i, cnt);
19            i = (nums[i] % n + i+ n) % n;
20            if ((forward && nums[i] < 0) || (!forward && nums[i] > 0) || vs[i]) res = false;
21            cnt++;
22        }
23        if (res) for (int key : cnts.keySet()) vs[key] = true;
24        return res && cnt - cnts.get(i) > 1;
25    }
26}