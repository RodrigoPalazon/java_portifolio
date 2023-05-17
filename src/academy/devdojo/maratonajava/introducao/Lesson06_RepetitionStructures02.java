package academy.devdojo.maratonajava.introducao;

public class Lesson06_RepetitionStructures02 {
    public static void main(String[] args) {
//        Printing all the even numbers from 0 to 100

        int num = 0;

        System.out.println("Using while: ");
        while(num <= 100) {
            System.out.println(num);
            num += 2;
        }

//        or using for loop
        System.out.println("Using for: ");
        for(num = 5; num <= 100; num++){
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
