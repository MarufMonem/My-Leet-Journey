package P50;

public class Solution_recursion {
    public static double myPow(double x, int n) {
        return recursionHelper(x, n);

    }

    public static double  recursionHelper(double x, int n){
        if (n%2 == 0){
            return recursionHelper(x * x, n/2);
        }else{
            return recursionHelper(x* x * x, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
}
