// x = 2 and n = 3 so 2^3 = 8; 
public class x_pow_n {
    public static void main(String[] args) {
        int x = 4;
        int n = 8;
        int res = power(x,n);
        int res2 = powerOptimize(x,n);
        System.out.println(res2);
    }
    // method - 1 (O(N))
    public static int power(int x , int n){
        if(n == 0) return 1;
       return x * power(x, n-1);
    }

    // Method - 2 (Optimise)(O(log N))
    public static int powerOptimize( int x , int n){
        if( n == 0) return 1;

        int halfpowersq = powerOptimize(x, n/2);

        if(n % 2 == 0){
            return halfpowersq * halfpowersq;
        }
        else{
            return x * halfpowersq * halfpowersq;
        }
    }
}
