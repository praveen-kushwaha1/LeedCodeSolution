class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,h=arr.length-1,m;
        while(h>=l){
            m=(h-l)/2+l;
            if(arr[m-1]<arr[m] && arr[m+1]<arr[m]){
                return m;
            }
            else if(arr[m-1]>arr[m] && arr[m+1]<arr[m]){
                h=m;
            }
            else{
                l=m;
            }
        }
        return l;
    }
}