public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача № 2");
        for (int u = 10; u >= 1; u--) {
            System.out.println(u);
        }

        System.out.println("Задача № 3");
        for (int y = 0; y <= 16; y = y + 2) {
            System.out.println(y);
        }

        System.out.println("Задача № 4");
        for (int r = 10; r >= (-10); r--) {
            System.out.println(r);
        }

        System.out.println("Задача № 5");
        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println(g + " год является високосным.");
        }

        System.out.println("Задача № 6");
        for (int k = 7; k <= 98; k = k + 7) {
            System.out.println(k);
        }

        System.out.println("Задача № 7");
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        System.out.println("Задача № 8");
        int money = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + money;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача № 9");
        int money1 = 29000;
        int total1 = 0;
        for (int b = 1; b <= 12; b++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + money1;
            System.out.println("Месяц " + b + " сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Задача № 10");
        int a = 2;
        for (int l = 1; l <= 10; l++) {
            System.out.println(a + "*" + l + "=" + a * l);
        }
    }
}