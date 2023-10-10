import java.util.Random;

public class largest {
//    static int A[] = {11, 273, 69, 666, 101};
    // Method to find maximum
    static int largest(int[] arr){

        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        Random r = new Random();

        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++ ){
            arr[i] = r.nextInt();
        }

        System.out.println(largest(arr));

        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;

        System.out.println(elapsed);

    }

}
