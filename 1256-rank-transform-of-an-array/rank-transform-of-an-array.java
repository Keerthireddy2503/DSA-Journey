class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int a[] = arr.clone();
        Arrays.sort(a);
        int k=0;
        for(int i=0;i<a.length;i++){
            if(i==0 || a[i]!=a[i-1]){
                a[k]=a[i];
                 k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            int start = 0;
            int end = k-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(a[mid]==arr[i]){
                    arr[i]=mid+1;
                    break;
                }
                else if(a[mid]<arr[i]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
            return arr;
    }
}