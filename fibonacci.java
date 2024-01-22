//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class fibonacci {
    public static void main(String[] args) {

        int num = 10;
        int nth = calc(num);

        System.out.println("The " + num + "th term of the Fibonacci sequence is " + nth + ".");
    }

    public static int calc(int num) {
        if (num <= 1) {
            return num;
        } else {
            return calc(num - 1) + calc(num - 2);
        }
    }
}