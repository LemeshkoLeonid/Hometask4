package arrays;

public class EvenToZero {
    public static void main (String[] args) {
        int[] arr = new int[2000];
        for (int i = 0; i < 2000; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
    }
}
