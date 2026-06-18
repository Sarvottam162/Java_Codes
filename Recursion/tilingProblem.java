//Q -> Given a "2 * n" board and tile of size "2 * 1" count number of ways to tile the given board using "2 * 1" tiles;


public class tilingProblem {
    public static void main(String[] args) {
        int n = 5;
        int ways = tiling(n);
        System.out.println(ways);
    }
    public static int tiling(int n){
        if(n == 0 || n == 1)return 1;
        
        int verticallyPlaced =  tiling(n - 1);
        int horizontallyPlaced = tiling(n - 2);
        return verticallyPlaced + horizontallyPlaced;  // total ways
    }
}
