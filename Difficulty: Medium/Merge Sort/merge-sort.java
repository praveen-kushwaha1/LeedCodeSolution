class Solution {



    void mergeSort(int arr[], int l, int r) {
        
        if(l>=r)return ;
        
        int m=(r-l)/2+l;
        
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
        
        
    }
    
    void merge(int []arr,int l,int m,int r){
        
        int []temp=new int [r-l+1];
        
        int i=l;
        int j=m+1;
        int k=0;
        
        while(i<=m && j<=r){
            if(arr[i]<=arr[j])temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        
        while(i<=m)temp[k++]=arr[i++];
        while(j<=r)temp[k++]=arr[j++];
        
        for(m=0;m<temp.length;m++){
            arr[l+m]=temp[m];
        }
    }
}