public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 2
        System.out.println("Задача 2");
        {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 3
        System.out.println("Задача 3");
        {
            for (int i = 0; i < 17; i += 2) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 4
        System.out.println("Задача 4");
        {
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 5
        System.out.println("Задача 5");
        {
            for (int i = 1904; i <= 2096; i += 4) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 6
        System.out.println("Задача 6");
        {
            for (int i = 7; i <= 98; i += 7) {
                System.out.println(i);
            }
        }
        System.out.println("-------");

        // Задача 7
        System.out.println("Задача 7");
        {
            int x = 1;
            for (int i = 0; i < 10; i++) {
                System.out.println(x);
                x *= 2;
            }
        }
        System.out.println("-------");

        // Задача 8
        System.out.println("Задача 8");
        {
            int deposit = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total += deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("-------");

        // Задача 9
        System.out.println("Задача 9");
        {
            float deposit = 29000F;
            float total = 0;
            for (int i = 1; i <= 12; i++) {
                total += total * 1 / 100;
                total += deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("-------");

        // Задача 10
        System.out.println("Задача 10");
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + 2 * i);
            }
        }
        System.out.println("-------");

    }
}