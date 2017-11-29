package com.company;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    private static DecimalFormat df4 = new DecimalFormat(".####");

    //Ввод данных
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        double a = getDouble();
        double b = getDouble();
        char mo = getOperation();
        double result = calc(a, b, mo);
        System.out.println("Результат операции: " + df4.format(result));
    }

    public static double getDouble()
    {
        System.out.println("Введите число:");
        double num;
        num = scan.nextDouble();
        return num;
    }

    public static char getOperation()
    {
        System.out.println("Введите операцию:");
        char mo;
        mo = scan.next().charAt(0);
        return mo;
    }

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