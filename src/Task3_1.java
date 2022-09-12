import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Введите год в формате \"yyyy\"");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
    /*
    Високосный год — это год, номер которого делится без остатка на 400 (например 2000 или 2400),
    либо делится на 4 но не делится на 100 (например 2008, 2096, но не 2100).
    */
        boolean div400 = (year % 400 == 0) ? true : false;
        boolean div4   = (year %  4== 0) ? true : false;
        boolean div100 = (year % 100 == 0) ? true : false;
        //System.out.println("div400=" + div400 + " div4=" + div4 + " div100=" + div100);

        if ((div400) || (div4 && !div100)) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
}
