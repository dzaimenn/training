package dzaimenn.datatype;

public class DataType {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        double doubleNum1 = 10.5;
        double doubleNum2 = 3.5;
        double doubleSum = doubleNum1 + doubleNum2;
        double doubleDifference = doubleNum1 - doubleNum2;
        double doubleProduct = doubleNum1 * doubleNum2;
        double doubleQuotient = doubleNum1 / doubleNum2;

        float floatNum1 = 20.5f;
        float floatNum2 = 4.5f;
        float floatSum = floatNum1 + floatNum2;
        float floatDifference = floatNum1 - floatNum2;
        float floatProduct = floatNum1 * floatNum2;
        float floatQuotient = floatNum1 / floatNum2;

        long longNum1 = 1000000000L;
        long longNum2 = 200000000L;
        long longSum = longNum1 + longNum2;
        long longDifference = longNum1 - longNum2;
        long longProduct = longNum1 * longNum2;
        long longQuotient = longNum1 / longNum2;

        System.out.println("Integer Sum: " + sum);
        System.out.println("Integer Difference: " + difference);
        System.out.println("Integer Product: " + product);
        System.out.println("Integer Quotient: " + quotient);
        System.out.println("Integer Remainder: " + remainder);

        System.out.println("Double Sum: " + doubleSum);
        System.out.println("Double Difference: " + doubleDifference);
        System.out.println("Double Product: " + doubleProduct);
        System.out.println("Double Quotient: " + doubleQuotient);

        System.out.println("Float Sum: " + floatSum);
        System.out.println("Float Difference: " + floatDifference);
        System.out.println("Float Product: " + floatProduct);
        System.out.println("Float Quotient: " + floatQuotient);

        System.out.println("Long Sum: " + longSum);
        System.out.println("Long Difference: " + longDifference);
        System.out.println("Long Product: " + longProduct);
        System.out.println("Long Quotient: " + longQuotient);
    }
}