package org.example;

import org.junit.jupiter.api.Test;                 // ⬅️ use JUnit 5 Test
import java.util.Scanner;

import static org.example.App.askAmount;
import static org.junit.jupiter.api.Assertions.*;  // JUnit 5 assertions

class AppTest {

    @Test
    void loopNumbers() {

        String expected = "i = 1\n" +
                "i = 2\n" +
                "i = 3\n";

        assertEquals(expected,App.loopNumbers(3));
    }

    @Test
    void askAmount() {
        String in = "2";
        Scanner scanner = new Scanner(in);
        assertEquals(2, App.askAmount(scanner));
    }
}