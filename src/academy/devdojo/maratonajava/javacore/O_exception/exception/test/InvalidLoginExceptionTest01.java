package academy.devdojo.maratonajava.javacore.O_exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String userNameDB = "Will";
        String passwordDB = "123admin";

        System.out.println("User: ");
        String typedUserName = input.nextLine();
        System.out.println("Password: ");
        String typedPassword = input.nextLine();

        if (!typedUserName.equals(userNameDB) || !typedPassword.equals(passwordDB)) {
            throw new InvalidLoginException("Invalid UserName or Password");
        }
        System.out.println("User Successfully Logged In.");
    }
}
