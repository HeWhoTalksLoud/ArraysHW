public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] n = new int[]{1, 2, 3};
        double[] d = {1.57, 7.654, 9.986};
        String[] s = new String[]{"house", "that", "Jack", "built"};

        // Задача 2
        int i;

        for (i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i < n.length - 1) System.out.print(", ");
        }
        System.out.println();

        for (i = 0; i < d.length; i++) {
            System.out.print(d[i]);
            if (i < d.length - 1) System.out.print(", ");
        }
        System.out.println();

        for (i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i < s.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        // Задача 3
        for (i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        for (i = d.length - 1; i >= 0; i--) {
            System.out.print(d[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        for (i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        // Задача 4
        for (i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0)
                n[i]++;
            System.out.print(n[i]);
            if (i < n.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        task1();
        System.out.println();

        task2();
        System.out.println();

        task3();
        System.out.println();

        task4();
        System.out.println();

    } // main

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        int[] arr = generateRandomArray();
        int sum = 0;

        System.out.println("Задача 1");
        for (int n : arr) {
            sum += n;
        }
        System.out.println("Сумма трат за месяц составила " + sum +  " рублей");


    }

    public static void task2() {

        int[] arr = generateRandomArray();
        int min = arr[0], max = arr[0];
        int n;

        System.out.println("Задача 2");
        for (int i = 1; i < arr.length; i++) {
            n = arr[i];
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {

        int[] arr = generateRandomArray();
        double sum = 0;
        double avg;

        System.out.println("Задача 3");
        for (int n :
                arr) {
            sum += n;
        }
        avg = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.%n", avg);

    }

    public static void task4() {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println("Задача 4");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}