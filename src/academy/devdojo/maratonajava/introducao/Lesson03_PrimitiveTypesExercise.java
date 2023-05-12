package academy.devdojo.maratonajava.introducao;

import java.text.DateFormat;
import java.util.Date;

/*
Exercise.

Create variables to the beneath inputs between <>, and
print out the following message:

I, <name>, living in the address <address>,
confirm that I received the salary of <salary>, in the date <date>.
 */
public class Lesson03_PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Rodrigo Palazon";
        String address = "Amsterdam Avenue 776 - The Netherlands";
        double salary = 2000.00F;
        String dateReceivedSalary =  "05/10/2023";
        String messageReport = "I," + name + ", living in the address: " + address + "," + "\n" +
                               "confirm that I received the salary of $" + salary + ", in the date " +
                                dateReceivedSalary + ". ";

        System.out.println(messageReport);

    }
}
