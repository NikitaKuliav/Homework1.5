public class Main {

    // Генератор массивов с размером 30 и данными от 100_000 до 200_000

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        // Задача 1

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задача 2

        System.out.println();

        int min = 200_001;
        int max = 0;

        for (int current : arr) {
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

        // Задача 3

        float average = (float) sum / arr.length;

        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

    }
}