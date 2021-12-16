package guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    Scanner sc;

    public UserInputHandler() {
        sc = new Scanner(System.in);
    }

    public int getNumberFromUser() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered text, please give me number");
                sc.next();
            }
        }
    }
}
