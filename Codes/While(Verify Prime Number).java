/* Make a Java code that using the while loop goes through the numbers from 1 to 100 and say or Display on the screen only those that are primes.*/
public class primeWhile {
    public static void main(String[] args) {
        int i = 0, counter = 0;
        while (i <= 100) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.println(i);
            }
            else{
                counter=0;
            }
            i++;
        }
    }
}
