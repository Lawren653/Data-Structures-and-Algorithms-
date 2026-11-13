public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20};
        int value = 20;
        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
