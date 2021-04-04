package arrays;


public class Avg {
    public static void main (String[] args) {
        int[] arr = new int[200];
        int sum = 0;
        double mult = 1;

        for (int i = 0; i < 200; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            sum += arr[i];
            mult = mult * arr[i];
        }

        float avg_a = sum / arr.length;
        double avg_g = Math.sqrt(mult);
    }
}
