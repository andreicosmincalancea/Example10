import java.util.Scanner;

public class Example10 {
    public static void main(String [] argv) {
        int number;
        System.out.println("Insert number");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();

        if (number >=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
