import java.util.Random;

public class sumOdd {

    public static int sumOdd(int[] nums){
        int size = nums.length;
        int oddsum = 0;

        if (size >= 1) {
            for (int i=1; i<size; i++)
            {
                if (nums[i] % 2 != 0)
                    oddsum += nums[i];
            }
        }
        return oddsum;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // Test Code (commented out)
//        int[] arr =  {2, 4, 7, 3, 6};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++ ){
//            arr[i] += sum;
//        }

        Random r = new Random();

        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(0, 10);
        }

        System.out.println();
        System.out.println("The sum of all positive odd numbers is: " + sumOdd(arr));

        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;

        System.out.println('\n' + "Time elapsed: " + elapsed + " nanoseconds");

    }
}
