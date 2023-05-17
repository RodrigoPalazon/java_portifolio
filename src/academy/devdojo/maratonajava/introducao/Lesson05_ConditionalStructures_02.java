package academy.devdojo.maratonajava.introducao;

public class Lesson05_ConditionalStructures_02 {
    public static void main(String[] args) {
        int age = 03;
        String category;

        if(age < 13) {
            category = "Kid";
        } else if (age < 20) {
            category = "Teenager";
        }else{
            category = "Adult";
        }
        System.out.println(category);
    }
}
