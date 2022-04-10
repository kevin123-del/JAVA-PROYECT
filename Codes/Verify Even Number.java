/* Make a code in java using the for loop, that goes from 1 to 100 and tells me which number is even and which is odd, showing the number
is even and which is odd by displaying the number*/
public class checkEvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            }
            else {
                System.out.println("The number " + i + " is odd");
            }
        }
    }
}
