public class QuickSort {
    // Partition function
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // Pivot is the last element
        int i = start - 1; // Index of the smaller element

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[end] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1; // Return pivot index
    }

    // QuickSort function
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, start, end);

            // Recursively sort elements before and after the pivot
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Apply QuickSort
        quickSort(arr, 0, n - 1);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
