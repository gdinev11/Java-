import java.util.Scanner;
public class Factorial {
    // iterative or non-recursive
    public static int factorial1(int n){
        if(n<0){
            return -1;
        }
        int product = 1;
        for(int i=1; i<=n; i++){
            product *= i;
        }
        return product;
    }

    public static int factorial2(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial2(n-1);
        }
    }
    public static void main(String[] args) {
//        int n = 30, first = 0, second = 1;
//        System.out.println("Fib series till " + n);
//
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(first + "");
//            int next = first + second;
//            first = second;
//            second = next;
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please type an integer: ");
        int x = input.nextInt();
        System.out.println("Iterative Solution: " + factorial1(x));
        System.out.println("Recursive solution: " + factorial2(x));
    }

}
