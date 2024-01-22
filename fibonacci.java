/**
 * The fibonacci class provides the methods to calculate the nth term in the fibonacci sequence using recursion.
 * @author      John Lucey
 * @version     1.0
 */



public class fibonacci {
    public static void main(String[] args ) {

        /**
         * Calls the calc method using 10 as the passed argument of 10 and generates result.
         */

        // The variable passed as argument
        int num = 10;

        // Used to calculate the nth term
        int nth = calc(num);

        System.out.println("The " + num + "th term of the fibonacci sequence is " + nth + ".");
    }



    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param num Tracks the position of the term in the fibonacci sequence.
     * @return Provide the nth term in the fibonacci sequence.
     */

    public static int calc(int num) {
        if (num <= 1) {
            return num;
        } else {
            return calc(num - 1) + calc(num - 2);
        }
    }
}