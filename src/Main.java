public class Main {
    public static void main(String[] args) {
        // Задание 1 Домашние задание 1
        System.out.println("Задание 1 Домашние задание 1");
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        // Задание 2 Домашние задание 1
        System.out.println("Задание 2 Домашние задание 1");
        {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }

        // Задание 3 Домашние задание 1
        System.out.println("Задание 3 Домашние задание 1");
        {
            for (int i = 0; i <= 17; i += 2) {
                System.out.println(i);
            }
        }

        // Задание 4 Домашние задание 1
        System.out.println("Задание 4 Домашние задание 1");
        {
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
        }

        // Задание 1 Домашние задание 2
        System.out.println("Задание 1 Домашние задание 2");
        {
            for (int i = 1904; i <= 2096; i = i+4) {
                System.out.println(i + " год является високосным");
            }
        }

        // Задание 2 Домашние задание 2
        System.out.println("Задание 2 Домашние задание 2");
        {
            for (int i = 7; i <= 98; i = i+7) {
                System.out.println(i);
            }
        }

        // Задание 3 Домашние задание 2
        System.out.println("Задание 3 Домашние задание 2");
        {
            for (int i = 1; i <= 512; i = i*2) {
                System.out.println(i);
            }
        }

        // Задание 1 Домашние задание 3
        System.out.println("Задание 1 Домашние задание 3");
        {
            int savings = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + savings;
                System.out.println("Месяц " + i +", сумма накоплений равна " + total + " рублей");
            }
        }

        // Задание 2 Домашние задание 3
        System.out.println("Задание 2 Домашние задание 3");
        {
            double savings = 29000;
            double total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + total/100;
                total = total + savings;
                System.out.println("Месяц " + i +", сумма накоплений равна " + String.format("%.2f", total) + " рублей");
            }
        }
    }
}
