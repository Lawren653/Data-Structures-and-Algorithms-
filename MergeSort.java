import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        
        if (left >= right) {
            return;
        }

        
        int middle = left + (right - left) / 2;

        
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);

        
        merge(array, left, middle, right);
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) {
                temporary[k++] = array[i++];
            } else {
                temporary[k++] = array[j++];
            }
        }

    
        while (i <= middle) {
            temporary[k++] = array[i++];
        }

    
        while (j <= right) {
            temporary[k++] = array[j++];
        }

        
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
