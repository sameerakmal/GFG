class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        int n = arr.length;
        for(int j = n - 1; j >= 0; j--){
            int i = j;
            while(2*i + 1 < n){
                int mini = 2*i + 1;
                if(2*i + 2 < n && (arr[2*i + 2] < arr[mini])){
                    mini = 2*i + 2;
                }
                
                if(arr[i] > arr[mini]){
                    int temp = arr[i];
                    arr[i] = arr[mini];
                    arr[mini] = temp;
                    i = mini;
                }
                else{
                    break;
                }
            }
        }
        while(n > 1){
            int temp1 = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = temp1;
            n = n-1;
            int i = 0;
            while(2*i + 1 < n){
                int mini = 2*i + 1;
                if(2*i + 2 < n && arr[2*i + 2] < arr[mini]){
                    mini = 2*i + 2;
                }
                if(arr[i] > arr[mini]){
                    int temp = arr[i];
                    arr[i] = arr[mini];
                    arr[mini] = temp;
                    i = mini;
                }
                else{
                    break;
                }
            }
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return;
    }
}