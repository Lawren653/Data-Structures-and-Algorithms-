public class ArrayInsert {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 0, 0};
        int size = 3;
        int index = 1;
        int value = 15;

        if (index >= 0 && index <= size && size < array.length) {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
