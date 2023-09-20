class Solution {
     static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    static int partition(int[] arr, int low, int high) {
        // Choosing the pivot middle element
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            // sort the left part then right
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
}