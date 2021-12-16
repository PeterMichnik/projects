package token;

import java.util.Random;

public class Token {
    Random random = new Random();
    private String chars = "abcdefghijklmnopersuwyzABCDEFGHIJKLMNOPERSTUWYZ012356789#@!$%^&*()";

    public String generate(int tokenLenght) {
        int i = 0;
        while (i < tokenLenght) {
            char token = chars.charAt(random.nextInt((chars).length()));
            System.out.print(token);
            i++;
        }
        return chars;
    }
}
