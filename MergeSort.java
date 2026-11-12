import java.util.Arrays;

public class MergeSort {
    // Divides the array, sorts each half, and combines the results.
    public static void mergeSort(int[] array, int left, int right) {
        // Base case: an array section with zero or one element is sorted.
        if (left >= right) {
            return;
        }

        // DIVIDE
        int middle = left + (right - left) / 2;

        // CONQUER
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);

        // COMBINE
        merge(array, left, middle, right);
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        // Compare values from both halves and copy the smaller one.
        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) {
                temporary[k++] = array[i++];
            } else {
                temporary[k++] = array[j++];
            }
        }

        // Copy any values left in the first half.
        while (i <= middle) {
            temporary[k++] = array[i++];
        }

        // Copy any values left in the second half.
        while (j <= right) {
            temporary[k++] = array[j++];
        }

        // Copy the merged values back into the original array.
        for (int x = 0; x < temporary.length; x++) {
            array[left + x] = temporary[x];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Unsorted array: " + Arrays.toString(numbers));

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}
