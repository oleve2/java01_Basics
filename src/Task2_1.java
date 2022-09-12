import java.util.Scanner;

public class Task2_1 {
    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа расчета суммы трех чисел");
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int value3 = scanner.nextInt();

        int resSum = sum(value1, value2, value3);
        System.out.println("Сумма чисел = " + resSum);
    }
}
