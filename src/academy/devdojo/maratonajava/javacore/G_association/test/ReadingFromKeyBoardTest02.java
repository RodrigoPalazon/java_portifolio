package academy.devdojo.maratonajava.javacore.G_association.test;

import java.util.Scanner;

public class ReadingFromKeyBoardTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Predicting the Future");
        System.out.println("Type your question for a 'YES' or 'NO' answer");
        String question = input.nextLine();

        if(question.charAt(0) == ' ') {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
