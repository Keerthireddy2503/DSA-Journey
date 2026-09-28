class Solution {
    public int trap(int[] a) {
        int left =0;
        int right=a.length-1;
        int leftmax=a[left];
        int rightmax=a[right];
        int water=0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,a[left]);
                water+=leftmax-a[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,a[right]);
                water+=rightmax-a[right];
            }
        }
        return water;
    }
}