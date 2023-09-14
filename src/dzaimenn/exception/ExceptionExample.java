package dzaimenn.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred.");
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            int num = list.get(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred.");
        }

        try {
            Object obj = new Integer(10);
            String str = (String)obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred.");
        }

        try {
            int result = divide(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: Division by zero.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    
}