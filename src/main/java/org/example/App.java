package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        loopNumbers(askAmount(input));
    }
    public static void loopNumbers(int loopAmount){
        for (int i = 1; i <= loopAmount; i++) {
            System.out.println("i = " + i);
        }
    }
    public static int askAmount(Scanner scanner){
        System.out.println("how many numbers to display in the loops?");
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        }
    }
}