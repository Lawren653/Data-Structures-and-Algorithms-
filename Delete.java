public class ArrayDelete {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 0};
        int size = 4;
        int index = 1;

        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
