package arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        int i;
        for (i = 0; i < 1000; i++ ){
            arr[i] =(int) (Math.random() * 100);
       }


       for(i = 1; i < arr.length; i++){
           int currElem = arr[i];
           int prevElem = i - 1;
           while (prevElem >= 0 && arr[prevElem] > currElem){
               arr[prevElem+1] = arr[prevElem];
               arr[prevElem] = currElem;
               prevElem--;
           }

       }
       for (i=0; i< arr.length;i++) {
           System.out.println(arr[i]);
       }

    }

}
