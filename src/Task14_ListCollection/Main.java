package Task14_ListCollection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TaskManager tm1 = new TaskManager("some name");
        tm1.processLoop(scn);
    }
}
