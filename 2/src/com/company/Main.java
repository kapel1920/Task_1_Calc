package com.company;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
    //Ввод данных
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        double a = getDouble();
        double b = getDouble();
     //  double a = 1.5555;
     //  double b = 1.1111;
        char mo = getOperation();
        double c = calc(a, b, mo);
        // int c = calc (a, b, mo);
        System.out.println("Результат операции: " + c);
    }

    public static double getDouble()
    {
        System.out.println("Введите число:");
        // int num;
        double num;
        //num = scan.nextInt();
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
              /*  String.format("%.2f", result);*/
        }
        return result;
    }
}