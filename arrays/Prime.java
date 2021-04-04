package arrays;

public class Prime {
    public static void main (String[] args) {

        int[] arr = new int[1000];
        int amount_prime_elements = 0;
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            if (prime(arr[i])) {
                amount_prime_elements++;
            }
        }
        System.out.println(amount_prime_elements);
    }
    private static boolean prime (int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
