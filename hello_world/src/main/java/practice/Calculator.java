package practice;

import java.util.Scanner;

public class Calculator 
{
    private static float x;
    private static float y;

    private static float add(float x, float y)
    {
        return x + y;
    }

    private static float subtract(float x, float y)
    {
        return x - y;
    }

    private static float multiply(float x, float y)
    {
        return x * y;
    }

    private static float divide(float x, float y)
    {
        if (y == 0) 
        {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        x = scanner.nextFloat();
        System.out.println("Enter second number:");
        y = scanner.nextFloat();
        System.out.println("""
                           Select operation (Case sensitive):
                           a. Add
                           s. Subtract
                           m. Multiply
                           d. Divide""");
        char operation = scanner.next().charAt(0);
        if (operation == 'a') 
        {
            System.out.println("Result: " + add(x, y));
        } 
        else if (operation == 's') 
        {
            System.out.println("Result: " + subtract(x, y));
        } 
        else if (operation == 'm') 
        {
            System.out.println("Result: " + multiply(x, y));
        } 
        else if (operation == 'd') 
        {
            System.out.println("Result: " + divide(x, y));
        } 
        else 
        {
            System.out.println("Invalid operation selected.");
        }
    }
}