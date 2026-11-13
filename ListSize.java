public class ArrayListSize {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 0, 0};
        int size = 0;

        for (int value : array) {
            if (value != 0) {
                size++;
            }
        }

        System.out.println(size);
    }
}
