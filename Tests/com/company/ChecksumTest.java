package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChecksumTest {
    @Test
    void start() {
    }

    @Test
    void askUserInput() {

    }

    @Test
    void inputIsNotValid() {
        String userInput = "3";
        assertTrue(!userInput.equals("1") && !userInput.equals("2"), userInput);
        userInput = "1";
        assertFalse(!userInput.equals("1") && !userInput.equals("2"), userInput);
    }
}