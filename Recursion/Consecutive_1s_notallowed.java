public class Consecutive_1s_notallowed {
    public static void main(String[] args) {
        int n = 3;
        printPath(n , 0 , "");
    }
    public static void printPath(int n , int lastPlaced , String s){

        if( n == 0){
            System.out.println(s);
            return;
        }

        printPath(n - 1 , 0, s + "0");
        if(lastPlaced == 0){
            printPath(n - 1 , 1, s + "1");
        }
    }
}



// for n = 3
// valid output
// 000
// 001
// 010
// 100
// 101

// invalid output

// 000
// 001
// 010
// 100
// 101
// 111