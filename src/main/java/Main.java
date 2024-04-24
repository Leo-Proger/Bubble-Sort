public class Main {
    public static void main(String[] args) {
        int[] array = {6, 2, 3, 5, 1, 4};
        BubbleSort.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
