/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int N = 100; // Change N to the desired range

        int i = 1; // Initialize a variable to start from 1

        while (i <= N) {
            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i++; // Increment the number for the next iteration
        return i;
    }
}