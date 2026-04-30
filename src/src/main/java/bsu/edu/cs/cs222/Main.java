package bsu.edu.cs.cs222;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ARABIC TO ROMAN NUMERAL TRANSLATOR");
        Scanner scanner = new Scanner(System.in);

        int input = 1;
        while (input != 0) {
            System.out.println("Enter a number 1 - 3000 (0 to exit): ");
            input = scanner.nextInt();
            String output = RomanNumeralConverter.convert(input);
            if (output.isEmpty() && input != 0) {
                System.out.println("invalid input");
                input = 1;
            } else {
                System.out.println(output);
            }
        }
        System.out.println("Have a great day!");
    }
}
