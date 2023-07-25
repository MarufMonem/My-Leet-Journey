package P50;

public class Solution_non_recursion {
    public static double myPow(double x, int n) {
        double result=1;
        long multiplier = Math.abs((long)n);
        System.out.println(multiplier);
        if(x ==0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            if(multiplier>0){
                while(multiplier!=0){
                    result = result * x;
                    multiplier--;
                }

            }else if(n==0){
                return 1;
            }

            if(n<0 && n != 0){
                System.out.println(result);
                return 1/result;
            }else{
                return result;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
    }
}
