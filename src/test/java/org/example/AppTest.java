package org.example;

import org.junit.jupiter.api.Test;                 // ⬅️ use JUnit 5 Test
import java.util.Scanner;

import static org.example.App.askAmount;
import static org.junit.jupiter.api.Assertions.*;  // JUnit 5 assertions

class AppTest {

    @Test
    void loopNumbers() {
    }

    @Test
    void askAmount() {
        String in = "2";
        Scanner scanner = new Scanner(in);
        assertEquals(2, App.askAmount(scanner));
    }
}