import java.util.Random;
public class smallest {
    // Method to find minimum element in an array of 1000 randomly generated integers
    static int smallest(int[] A){

        int min = A[0];

        for (int i = 1; i < A.length; i++){
            if(A[i] < min)
                min = A[i];
        }
        return min;
    }
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        System.out.println('\n' + "Random number between 0 and 1000000");

        Random r = new Random();

        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(0,1000000);
        }
        int Minimum = smallest(arr);
        System.out.println('\n' + "the minimum element is " + Minimum + '\n');

        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;

        System.out.println("the amount of time elapsed is " + elapsed + " milliseconds");
    }

}
