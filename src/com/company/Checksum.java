package com.company;

import java.util.Scanner;

public class Checksum {
    Scanner scan = new Scanner(System.in);
    private String userWord;
    private int[][] binaryMatrix;
    private String binaryWord;


    public void start() {
        Block block = new Block();
        printMenu();
        askUserInput();
        askUserSentence();
        binaryWord = convertSentenceToBinary();
        System.out.println(binaryWord);
        paritybits();
    }

    private void printMenu() {
        System.out.println("Bonjour, voulez vous ?");
        System.out.println();
        System.out.println("1 - Encoder");
        System.out.println("2 - Décoder");
    }

    private void askUserInput() {
        String userInput;
        do {
            userInput = scan.nextLine();
            if (inputIsNotValid(userInput)) {
                System.out.println("Erreur dans l'entrée");
            }
        } while (inputIsNotValid(userInput));
    }

    private boolean inputIsNotValid(String userInput) {
        return !userInput.equals("1") && !userInput.equals("2");
    }

    private void askUserSentence() {
        System.out.println("quel est le mot que vous voulez encoder ?: ");
        userWord = scan.nextLine();
    }

    private String convertSentenceToBinary() {
        StringBuilder binaryWord = new StringBuilder();
        for (int i = 0; i < userWord.length(); i++) {
            binaryWord.append(String.format("%8s", Integer.toBinaryString(userWord.charAt(i))).replaceAll(" ", "0"));
        }
        return binaryWord.toString();
    }

    private void paritybits() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; i <= 8; i++) {
                binaryMatrix[i][j] = binaryWord.charAt(j);
            }
        }
        //System.out.println(binaryMatrix[0][0]);
    }
}
