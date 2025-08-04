// User function Template for Java

class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        int[] diff = new int[n+1];
        for(int i = 0; i < a.length; i++){
            diff[a[i]] += k[i];
            if (b[i] + 1 < n) {
                diff[b[i] + 1] -= k[i];
            }
        }
        int max = Integer.MIN_VALUE;;
        int psum = 0;
        for(int i = 0; i < n; i++){
            psum += diff[i];
            max = Math.max(max, psum);
        }
        return max;
    }
}
