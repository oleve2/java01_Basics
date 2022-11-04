package Task14_ListCollection;

/*
1) Запрос списка задач/дел у пользователя;
2) Возможность добавить задачу в список;
3) Возможность удалить задачу из списка;
4) Возможность вывода всех задач с их номерами (для пользователя нумеровать с 1).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private String name;
    private List<String> taskList = new ArrayList<>();

    public TaskManager(String name) {
        this.name = name;
    }

    public String getName() { return  this.name; }
    public List<String> getTaskList() { return this.taskList; }

    public void addTask(String taskName) {
        this.taskList.add(taskName);
    }

    public void removeTask(String taskName) {
        for (int i=0; i < this.taskList.size(); i++) {
            if (this.taskList.get(i).equals(taskName)) {
                this.taskList.remove(i);
                break;
            }
        }
    }

    public void printTasksAndNumbers() {
        System.out.println("-------------------------");
        for (int i=0; i < this.taskList.size(); i++) {
            System.out.println((i+1) + ": " + this.taskList.get(i));
        }
    }

    public void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход ");
    }

    public void processLoop(Scanner scn) {
        while (true) {
            printMenu();
            String input = scn.nextLine();
            if (input.equals("0")) {
                System.out.println("Выход из программы");
                break;
            }

            String remName;
            switch (input) {
                case "1":
                    System.out.println("Введите название задачи");
                    String newName = scn.nextLine();
                    if (newName.length() > 0) {
                        this.addTask(newName);
                        break;
                    }
                case "2":
                    this.printTasksAndNumbers();
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Введите название задачи");
                    remName = scn.nextLine();
                    if (remName.length() > 0) {
                        this.removeTask(remName);
                        break;
                    }
            }
        }
    }
}
