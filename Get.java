public class ArrayGet {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int index = 1;

        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Wrong Index");
        }
    }
}
