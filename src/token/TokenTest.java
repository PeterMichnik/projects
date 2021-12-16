package token;

import java.util.Scanner;

public class TokenTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int tokenLenght = sc.nextInt();

        Token token = new Token();

        token.generate(tokenLenght);
//        token.generate(5);
    }
}
