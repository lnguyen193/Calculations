import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();

        System.out.println("Enter another number: ");

        int anoNumber = input.nextInt();

        System.out.println("Sum : " + (number + anoNumber));

        // Another way int sum = num + anoNum;
        // System.out.print("Sum: " + sum);
        // int product = num * anoNum;
        // System.out.print("Product: " + product);

        System.out.println("Product : " + (number * anoNumber) + "\n");

        System.out.println("Enter a number you want to square: ");

        number = input.nextInt();

        input.nextLine();
        System.out.println("Square: " + (number * number) + "\n");

        System.out.println("Enter the first line: ");
        String x = input.nextLine();


        System.out.println("Enter the second line: ");
        String y = input.nextLine();

        System.out.println(x + " " + y);
    }
}
