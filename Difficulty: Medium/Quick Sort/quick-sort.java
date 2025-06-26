class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        
        while(i < j) {
            while(i<=high && arr[i] <= arr[pivot]) {
                i++;
            }
            
            while(j>=low && arr[j] > arr[pivot]) {
                j--;
            }
            
            if(i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        
        return j;
    }
   
    
    
}