package systemFunctions;

import java.util.Scanner;

public class TypeVerification {

    public static void booleanCheck(Scanner in) {
        while (!in.hasNextBoolean()) {
            System.out.println("Введите текст типа boolean");
            in.next();
        }
    }

    public static void shortCheck(Scanner in) {
        while (!in.hasNextShort()) {
            System.out.println("Введите число типа short");
            in.next();
        }
    }

    public static void doubleCheck(Scanner in) {
        while (!in.hasNextDouble()) {
            System.out.println("Введите число типа double");
            in.next();
        }
    }
}
