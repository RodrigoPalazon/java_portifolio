package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Lesson05_ConditionalStructures_05 {
    public static void main(String[] args) {
//        Display the week days, considering 1 as Sunday

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number from 1 to 7 to pick a day of the week: ");

        byte dayOfWeek = scanner.nextByte();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please, choose a valid day (1 - 7)");
                break;

        }
    }
}
