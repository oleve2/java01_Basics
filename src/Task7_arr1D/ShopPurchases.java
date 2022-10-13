package Task7_arr1D;

import java.util.Scanner;

public class ShopPurchases {
    public String[] products = {"Хлеб", "Яблоки", "Молоко"};
    public int[] prices = {100, 200, 300};
    public int[] purchaseCnts = {0, 0, 0};

    public void printProductsPrices() {
        for (int i=0; i < this.products.length; i++) {
            System.out.println("#" + (i+1) + ": " + this.products[i] + "; price per 1 unit: " + this.prices[i] + ";");
        }
    }

    public void printPurchases() {
        int total = 0;
        System.out.println("Ваша корзина:");
        for (int i=0; i < this.purchaseCnts.length; i++) {
            if (this.purchaseCnts[i] > 0) {
                int tmpTotal = this.purchaseCnts[i] * this.prices[i];
                System.out.println("Товар:" + this.products[i] +
                        "; Количество:" + this.purchaseCnts[i] +
                        "; Цена за 1:" + this.prices[i] +
                        "; Общая стоимость:" + tmpTotal
                );
                total = total + tmpTotal;
            }
        }
        System.out.println("Итого " + total);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scan.nextLine();
            if (input.equals("end")) {
                this.printPurchases();
                break;
            }

            String[] argProdCnt = input.split(" ");
            int purchaseIndex = Integer.parseInt(argProdCnt[0])-1;
            int purchaseCnt = Integer.parseInt(argProdCnt[1]);
            this.purchaseCnts[purchaseIndex] += purchaseCnt;
        }
    }
}
