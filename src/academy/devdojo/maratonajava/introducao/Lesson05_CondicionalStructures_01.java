package academy.devdojo.maratonajava.introducao;

public class Lesson05_CondicionalStructures_01 {
    public static void main(String[] args) {
        int age_example1 = 12;
        int age_ternaryOperator = 18;
        boolean allowedToDrink = (age_example1 >= 18 && age_ternaryOperator >= 18);

        if(!allowedToDrink) {
            System.out.println("Not allowed to drink.");
        }else{
            System.out.println("Allowed to drink.");
        }
        System.out.println("Thanks for checking your age.");


        //Ternary Operator

        String message = allowedToDrink ? "Allowed to buy alcoholic drink.":"NOT Allowed to buy alcoholic drink.";
        System.out.println(message);
    }
}
