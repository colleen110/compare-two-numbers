/**
 *
 * Compare two numbers and print the result.
 *
 * Instruction
 * Prerequisite : JDK 5 or up installed
 * $ javac CompareTwoNumbers.java
 * $ java CompareTwoNumbers {number1} {number2}
 *
 * e.g.
 * $ java CompareTwoNumbers 1.1 1.2
 * > 1.1 < 1.2
 *
 * Author: Colleen Mayer<colleen110@gmail.com>
 */

public class CompareTwoNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please input two arguments");
        } else {
            try {
                printComparison(args[0], args[1]);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void printComparison(String s1, String s2) {
        try {
            double i = Double.parseDouble(s1);
            double j = Double.parseDouble(s2);
            Character result;
            
            if (i > j) result = '>';
            else if (i < j) result = '<';
            else result = '=';
            
            System.out.println(String.format("%s %c %s", s1, result, s2));
        } catch (NumberFormatException e) {
            System.out.println("Please input two numbers");
        }
    }
}
