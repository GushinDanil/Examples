package tasks;

import java.math.BigInteger;


public class Task3 {
    public static void main(String[] args) {
        sumOfDigInNum(  factorial(100));




    }
    /**
     * This func for search sum numbers of 100!
     *
     * I'm use parsing types
     *to add up the numbers*
     *
     * @param n
     * n - factorial of number
     * @return
     */
    public static void sumOfDigInNum(BigInteger n)
    {
        String  count= String.valueOf(n);
        Integer result=0;
        for (int i=0;i<count.length();i++){
            result+= Integer.parseInt( String.valueOf( count.charAt(i)));
        }
        System.out.println(result);
    }
    /**
     *  func for  find factorial for big number
     * @param n
     * @return
     */
    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        System.out.println(res);
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
