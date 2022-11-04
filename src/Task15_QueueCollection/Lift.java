package Task15_QueueCollection;

/*
Сегодня мы будем реализовывать программу для работы лифта 25-и этажного дома.
Нужно написать программу, которая считывает данные из консоли, ожидая ввода номера этажа.

- После ввода каждого числа (номера этажа) добавляет значение в очередь дальнейшего перемещения лифта.
- Как только пользователь введет 0, программа должна последовательно вывести список всех этажей, на которых лифт делал остановки, в формате:
    "этаж 1 -> этаж 22 -> этаж 0".
- Если пользователь ввел этаж вне диапазона 0-25, проигнорировать ввод таких данных.

Для реализации хранения введенных пользователем этажей отлично подойдет структура на основе интерфейса очередь (queue).
По мере ввода мы сможем добавлять в конец очереди новые значения.
*/


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lift {
    private String name;
    private Queue<String> q = new LinkedList<>();
    private int prevFloor = -1;

    public Lift(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }
    public int getPrevfloor() { return this.prevFloor; }
    public Queue<String> getQ() { return this.q; }

    public void printFloorsRoute() {
        StringBuilder sb = new StringBuilder("");
        int queueSize = this.q.size();

        for (int i=0; i < queueSize; i++) {
            String s1 = this.q.poll();
            if (i != queueSize-1) {
                sb.append("этаж ").append(s1).append(" -> ");
            } else {
                sb.append("этаж ").append(s1);
            }
        }
        System.out.println(sb.toString());
    }

    public void processLoop(Scanner scn) {
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String input = scn.nextLine();
            try {
                int inputInt = Integer.parseInt(input);
                if (inputInt == 0) {
                    System.out.println("Печатаем список этажей");
                    this.printFloorsRoute();
                    break;
                }

                if ((inputInt >=1) && (inputInt <= 25) && (inputInt != this.prevFloor)) {
                    this.q.offer(String.valueOf(inputInt));
                    this.prevFloor = inputInt;
                } else {
                    System.out.println("Введен некорректный этаж (нужно от 1 до 25)");
                }
            } catch (Exception e) {
                System.out.println("Номер этажа не в числовом формате");
            }
        }
    }
}
