package academy.devdojo.maratonajava.introducao;

public class Lesson05_CondicionalStructures_03 {
    public static void main(String[] args) {
//        Donate if salary > 5000;
        double salary = 4000;
        String donateMessage = "I will donate $500.";
        String doNotDonateMessage = "I cannot donate any value, sorry.";

        String result = (salary >= 5000) ? donateMessage : doNotDonateMessage;

        System.out.println(result);

    }
}
