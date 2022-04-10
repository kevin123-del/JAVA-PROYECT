/* Make a java code that can read a number by keyboard less than or equal to 500, the program must tell if the number entered is prime or not prime by displaying the number.
program should tell if the number entered is prime or not prime by displaying the number captured by the captured by the keyboard*/
import java.util.Scanner;
public class numPrime {
    public static void main(String[] args) {
        int num, counter = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter a number less than or equal to 500 : ");
            num = keyboard.nextInt();
        }while (num <= 0 || num > 500);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        
        if (counter <= 2 ) {
            System.out.println("The number " + num + " is prime.");
        }
        else {
            System.out.println("The number " + num + " is not prime.");
        }
    }
}
