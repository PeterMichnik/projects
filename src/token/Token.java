package token;

import java.util.Random;
import java.util.Scanner;

public class Token {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    private String chars = "abcdefghijklmnopersuwyzABCDEFGHIJKLMNOPERSTUWYZ012356789#@!$%^&*()";

    public String tokenGenerator() {

        System.out.print("Enter the number of characters: ");
        int tokenLenght = sc.nextInt();

        int i = 0;
        while (i < tokenLenght) {

            char token = chars.charAt(random.nextInt((chars).length()));

            System.out.print(token);

            i++;


        }


        return chars;

    }


}
