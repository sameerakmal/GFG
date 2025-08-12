class Solution {
    public boolean canSplit(int arr[]) {
        int tSum = 0;
        for(int i = 0; i < arr.length; i++){
            tSum += arr[i];
        }
        int pSum = 0;
        for(int i = 0; i < arr.length; i++){
            pSum += arr[i];
            if((tSum-pSum) == pSum) return true;
        }
        return false;
    }
}