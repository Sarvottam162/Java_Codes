public class fibonacci_Using_Recursion {
    public static void main(String[] args) {
        int n = 6 ; //nth fibonacci number is ? 0-based indexing
        int nth= fibo(n);
        System.out.println("nth fibonacci number is : "+nth);
    }
    public static int fibo(int n){
        if( n == 0 || n == 1) return n;

        int f1 = fibo(n - 1);
        int f2 = fibo(n - 2);
        return f1 + f2;
    }
}
