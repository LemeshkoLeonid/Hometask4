package arrays;

public class Compose {
    public static void main (String[] args) {
        int[] arr = new int[1000];
        int amount_compose_elements = 0;
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            if (compose(arr[i])) {
                amount_compose_elements++;
            }
        }
        System.out.println(amount_compose_elements);
    }

    private static boolean compose (int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }
}
