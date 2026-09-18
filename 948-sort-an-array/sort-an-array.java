class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            
            mergeSort(arr, left, mid);

            
            mergeSort(arr, mid + 1, right);

            
            merge(arr, left, mid, right);
        }
    }

    void merge(int[] arr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        // Compare both halves
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining left elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining right elements
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to arr
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
