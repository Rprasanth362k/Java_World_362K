// Java program to demonstrate Improved method to check if a number is prime
import java.util.Scanner;

// Driver Class
class Geeks
{
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
