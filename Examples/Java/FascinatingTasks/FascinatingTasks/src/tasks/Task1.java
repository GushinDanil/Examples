package tasks;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(numOfCorrectSequences(4));

    }

    /**
     *  func for  find factorial
     * @param n
     * @return
     */
    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    /**
     *C(n) = (2n)!/n!( n+1)!
     * formula(Catalana) for search true brakets expressions
     * @param n
     * n-non-negative integer
     * @return
     */
    public static long numOfCorrectSequences(int n){
        return factorial(2*n)/(factorial(n)*factorial(n+1));
    }
}
