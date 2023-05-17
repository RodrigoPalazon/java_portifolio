package academy.devdojo.maratonajava.introducao;

public class Lesson05_ConditionalStructures_06 {
    public static void main(String[] args) {
//        Using Switch, print if it's a workday or weekend,
//        considering 1 as Sunday

        byte dayOfWeek = 4;

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

        switch (dayOfWeek) {
            case 2, 3, 4, 5, 6:
                System.out.println("It's a work day");
                break;
            case 1, 7:
                System.out.println("It's weekend");
                break;
            default:
                System.out.println("Not possible to check.");
                break;
        }
    }
}