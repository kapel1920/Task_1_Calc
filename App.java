package main.java.simple;

import java.util.Scanner;


public class App {
    static Scanner scan = new Scanner(System.in);
    private static String x;

    public static void main(String[] args) {

        GiftBox box = new GiftBox();

        String nC = "  ";
        //double pC = 60;
        double pC = 0;
        double wC = 0;
        int uC = 1;
        int pU1 = 1;
        int s2;
        int vibor = 3;
        while (vibor != 0) {
         //   String nc1 = scan.nextLine(); //для чистки строки nameS
            System.out.println("Выберите действие: ");

            System.out.println("1 - Добавить шоколадку, 2 - Добавить печение, 4 - Удалить сладость из подарка, 0 - Выход (Итого)");

            int sl = scan.nextInt();

            if (sl == 0) {
             //   box.printItems();
            }

            if (sl == 4)
            {
                System.out.println("Введите уникальный номер для удаления сладости: ");
                s2 = scan.nextInt();

                box.delSweet(new delSweet1(nC, pC, wC, uC), s2);
               box.printItems();

                sl = 0;
            }
            if (sl == 1) {
                String nc1 = scan.nextLine(); //для чистки строки nameS
                System.out.println("Введите название шоколадки: ");
                nC = scan.nextLine();
                System.out.println("Введите цену шоколадки: ");
                pC = scan.nextInt();
                System.out.println("Введите вес шоколадки: ");
                wC = scan.nextInt();

                box.addSweet(new Chocolate(nC, pC, wC, uC));
            }
            if (sl == 2) {
                String nc1 = scan.nextLine(); //для чистки строки nameS
                System.out.println("Введите название печенья: ");
                nC = scan.nextLine();
                System.out.println("Введите цену печенья: ");
                pC = scan.nextInt();
                System.out.println("Введите вес печенья: ");
                wC = scan.nextInt();
                box.addSweet(new Cookie(nC, pC, wC, uC));
                }
            vibor = sl;
            if (sl == 1 ) {
                uC++;
                box.printItems();
            }
            if (sl == 2) {
                uC++;
                box.printItems();
            }
        }
        System.out.println("Итоговые вес подарка: " + box.getTotalWeight() + " итоговая цена подарка: " + box.getTotalPrice());
    }
}