public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        long population = 12_000_000;
        byte fertilityOneThousand = 17;
        byte mortalityOneThousand = 8;
        long growth = 0;
        for (int i = 1; i <= 10; i++) {
            population = population + growth;
            growth = population / 1000 * (fertilityOneThousand - mortalityOneThousand);
            System.out.println("Год " + i + ", численность населения составляет " + population + ".");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float depositAmount = 15000;
        float percent = 0.07f;
        for (int i = 0; depositAmount < 1_000_000; i++) {
            depositAmount = depositAmount + depositAmount * percent;
            System.out.println("В " + i + " месяц, на вкладе " + depositAmount);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float depositAmount = 15000;
        float percent = 0.07f;
        int years9 = 12 * 9;
        for (int i = 0; i < years9; i++) {
            depositAmount = depositAmount + depositAmount * percent;
            if (i % 6 == 0) {
                System.out.println("В " + i + " месяц, на вкладе " + depositAmount);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float depositAmount = 15000;
        float percent = 0.07f;
        int years9 = 12 * 9;
        for (int i = 0; i < years9; i++) {
            depositAmount = depositAmount + depositAmount * percent;
            if (i % 6 == 0) {
                System.out.println("В " + i + " месяц, на вкладе " + depositAmount);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 6;
        if (i <= 7) {
            for (int a = 1; a <= 31; a++) {
                int friday = a + 7;
                if ((friday - i) % 7 == 0) {
                    System.out.println("Сегодня пятница, " + a + "-е число. Необходимо подготовить отчет.");
                }
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int years = 2023;
        int beforeYears = years - 200;
        int afterYears = years + 100;
        for (int i = 0; i < afterYears; i += 79) {
            if (i > beforeYears) {
                System.out.println(i);
            }
        }
    }
}