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

    }
}