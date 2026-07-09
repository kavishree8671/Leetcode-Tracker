// Last updated: 7/9/2026, 3:13:33 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n;
        int[] arr = new int[total];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        for (int j = m; j < total; j++) {
            arr[j] = nums2[j - m];
        }

        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < total; i++) {
            nums1[i] = arr[i];
        }
    }
}