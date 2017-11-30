package com.company;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    //The main function
    //Round up to 4 decimal places
    /**
     * @author Veselkov Andrey
     *
     */

    private static DecimalFormat df4 = new DecimalFormat(".####");
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        double a = getDouble();
        double b = getDouble();
        char mo = getOperation();
        double result = calc(a, b, mo);
        System.out.println("Результат операции: " + df4.format(result));
    }

    //The method reads the value from the console and returns it

    /**
     * @author Veselkov Andrey
     * @return num Value for Calculation
     */
    public static double getDouble()
    {
        System.out.println("Введите число:");
        double num;
        num = scan.nextDouble();
        return num;
    }

    //The method reads the value from the console and returns a character with the operation (+, -, * or /)

    /**
     * @author Veselkov Andrey
     * @return mo Type of Operation
     */
    public static char getOperation()
    {
        System.out.println("Введите операцию (+, -, /, *) ");
        char mo;
        mo = scan.next().charAt(0);
        return mo;
    }

    //Calculation
    //The method executes a mathematical operation on numbers (num1) and (num2), which is defined by mo.
    /**
     * Validates a chess move.
     *
     * @author Veselkov Andrey
     * @param num1 Location of piece being moved
     * @param num2 Rank of piece being moved
     * @param mo Type of mathematical operation (addition +, subtraction -, multiplication *, division /).
     * @return result of mathematical operation
    invalid */

    public static double calc(double num1, double num2, char mo)
    {
        double result;
        switch (mo)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Введите тип операции: + сложение, - вычетание, / деление, * умножение");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}