class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int pMax = Integer.MIN_VALUE;
        int[] p = new int[n];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > pMax){
                pMax = arr[i];
            }
            p[i] = pMax;
        }
        
        int sMax = Integer.MIN_VALUE;
        int[] s = new int[n];
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > sMax){
                sMax = arr[i];
            }
            s[i] = sMax;
        }
        int ans = 0;
        for(int i = 1; i <= n-2; i++){
            int lMax = p[i-1];
            int rMax = s[i+1];
            int minH = Math.min(lMax, rMax);
            int water = minH - arr[i];
            if(water > 0){
                ans += water;
            }
        }
        return ans;
    }
}
