// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. gfg


public class friendPairingProblem {
    public static void main(String[] args) {
        int n = 4;
        int waysTotal = ways(n);
        System.out.println(waysTotal);
    }
    public static int ways(int n){
        if( n == 1 || n == 2) return n;

        int single = ways(n - 1); //choice 1
        int paired = (n - 1) * ways(n - 2);  // choice 2
        int totalways = single + paired;
        return totalways;
    }
}
