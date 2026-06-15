// x = 2 and n = 3 so 2^3 = 8; 
public class x_pow_n {
    public static void main(String[] args) {
        int x = 4;
        int n = 4;
        int res = power(x,n);
        System.out.println(res);
    }
    public static int power(int x , int n){
        if(n == 0) return 1;
       return x * power(x, n-1);
    }
}
