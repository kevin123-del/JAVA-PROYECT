/* Make a java code that can read three numbers by keyboard that refer to the 3 sides of a potential trinagle,
the program must say if with those 3 numbers it is possible to build a triangle or not*/
import java.util.Scanner;
public class verifyTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first side");
        float a = keyboard.nextFloat();
        System.out.println("Enter the second side");
        float b = keyboard.nextFloat();
        System.out.println("Enter the third side");
        float c = keyboard.nextFloat();
        if(a > 0 && b > 0 && c > 0){
            if((a + b) > c && (a + c) > b && (b + c) > lado1){
                System.out.println("It is a triangle");
            }else{
                System.out.println("It is not a triangle");
            }
        }else{
            System.out.println("A triangle cannot be made if one or more of its sides is equal to 0.");
         }
    }
}
