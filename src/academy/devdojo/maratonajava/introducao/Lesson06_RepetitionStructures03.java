package academy.devdojo.maratonajava.introducao;

public class Lesson06_RepetitionStructures03 {
//    Print the first 25 numbers from a given data (E.g. 50)
    public static void main(String[] args) {
        int maxValue = 50;
        for(int i=0; i <= maxValue; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
