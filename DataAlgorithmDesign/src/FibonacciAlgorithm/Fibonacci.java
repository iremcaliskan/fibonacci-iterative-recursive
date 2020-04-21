package FibonacciAlgorithm;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(RecursiveFibo(5)); //Output=5
        System.out.println(RecursiveFibo(6)); //Output=8
        System.out.println(IterativeFibo(7)); //Output=13
    }
    public static int  RecursiveFibo(int N){
        if (N <=1) { return N;}
        else { return RecursiveFibo( N-1)+ RecursiveFibo( N-2); }
    }

    public static int IterativeFibo(int N) {
        if ( N <= 1 ) {
            return N;
        }
        int fib = 1;
        int prevFib = 1;

        for ( int i=2 ;  i<N ; i++ ) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;

        }
        return fib;
    }

}
