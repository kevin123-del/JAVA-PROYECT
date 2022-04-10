/*check if it is a triangle and must say what type of triangle it is: (Rectangle, Isoceles or scalene) */
import java.util.Scanner;
public class verifyTriangleType {
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
                if(a == b && b == c){
                    System.out.println("It is an equilateral triangle");
                }else if(a == b || b == c || a == c){
                    System.out.println("It is an isosceles triangle");
                }else{
                    System.out.println("It is a scalene triangle");
                }
            }else{
                System.out.println("It is not a triangle");
            }
        }else{
            System.out.println("A triangle cannot be made if one or more of its sides is equal to 0.");
        }
    }
    
}
