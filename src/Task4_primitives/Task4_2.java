package Task4_primitives;

import java.util.Scanner;

public class Task4_2 {
    public static void printMenu() {
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");
    }

    // сравнение float т double
    public static void Compare(float v1, double v2) {
        double diff = 0.000001;

        if (Math.abs(v1 - v2) < diff) {
            System.out.println("числа равны");
        } else if (v1 > v2) {
            System.out.println(v1 + " больше чем "  + v2);
        } else if (v1 < v2) {
            System.out.println(v1 + " меньше чем "  + v2);
        }
    }

    // округление
    public static int Round2Positions(float v1) {
        return Math.round(v1);
    }

    // убрать дробную часть
    public static long RemoveTail(float v1) {
        return (long)v1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1: // 1. Сравнить
                    System.out.println("Введите число float:");
                    String val1Str = scanner.nextLine();
                    float val1 = Float.parseFloat(val1Str);
                    System.out.println("Введите число double:");
                    String val2Str = scanner.nextLine();
                    double val2 = Double.parseDouble(val2Str);

                    System.out.println("Результат:");
                    Compare(val1, val2);
                    System.out.println("================================================");
                    break;

                case 2: // 2. Округлить
                    System.out.println("Введите число:");
                    String valRoundStr = scanner.nextLine();
                    float valRound = Float.parseFloat(valRoundStr);
                    System.out.println("Результат: " + Round2Positions(valRound));
                    System.out.println("================================================");
                    break;

                case 3: // 3. Отбросить дробную часть
                    System.out.println("Введите число:");
                    String valShrinkStr = scanner.nextLine();
                    float valShrink = Float.parseFloat(valShrinkStr);
                    System.out.println("Результат: " + RemoveTail(valShrink));
                    System.out.println("================================================");
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
