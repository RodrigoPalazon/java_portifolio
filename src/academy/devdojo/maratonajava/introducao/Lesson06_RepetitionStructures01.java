package academy.devdojo.maratonajava.introducao;

public class Lesson06_RepetitionStructures01 {
    public static void main(String[] args) {
//        while, do while, for
        int count = 0;
        while(count <=  10) {
            System.out.println(count);
            count++;
        }

        do{
            System.out.println("Within the do do-while " + count);
            count++;
        } while(count < 10);

        for(count = 0; count < 10; count++) {
            System.out.println("For: " + count);
        }

    }
}
