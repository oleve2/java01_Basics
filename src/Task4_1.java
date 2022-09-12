import java.util.Scanner;

public class Task4_1 {
    public static void printMenu() {
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Выбрать ситему налогооблажения");
    }

    public static void printEarningSpending(int earnings, int spendings) {
        System.out.println("Earning=" + earnings + " Spendings=" + spendings);
        System.out.println("================================================");
    }

    public static double calcTaxUSNEarnings(int earnings) {
        double tax = earnings * 0.06;
        return tax;
    }

    public static double calcTaxUSNEarningsMinusSpendings(int earnings, int spendings) {
        double tax = (earnings - spendings) * 0.15;
        if (tax > 0) {
            return tax;
        } else {
            return 0.0;
        }
    }

    public static void compareTaxes(double tax1, double tax2) {
        System.out.println("Мы советуем вам " + ((tax1 < tax2) ? "УСН доходы" : "УСН доходы минус расходы"));
        System.out.println("Ваш налог составит: " + Math.min(tax1, tax2)  + " рублей");
        System.out.println("Налог на другой системе: " + Math.max(tax1, tax2) + " рублей");
        System.out.println("Экономия: " + Math.abs(tax1 - tax2) + " рублей");
        System.out.println("================================================");
    }

    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyEarnStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyEarnStr);
                    earnings += money;
                    printEarningSpending(earnings, spendings);
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneySpendStr = scanner.nextLine();
                    int moneySpend = Integer.parseInt(moneySpendStr);
                    spendings += moneySpend;
                    printEarningSpending(earnings, spendings);
                    break;
                case 3:
                    printEarningSpending(earnings, spendings);
                    double tax1 = calcTaxUSNEarnings(earnings);
                    double tax2 = calcTaxUSNEarningsMinusSpendings(earnings, spendings);
                    compareTaxes(tax1, tax2);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
