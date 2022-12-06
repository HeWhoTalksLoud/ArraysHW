public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] n = new int[]{1, 2, 3};
        double[] d = {1.57, 7.654, 9.986};
        String[] s = new String[]{"house", "that", "Jack", "built"};

        // Задача 2

        task1();
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

        System.out.println("Задача 1");

    }

    public static void task2() {

        System.out.println("Задача 2");
    }

    public static void task3() {

        System.out.println("Задача 3");

    }
}