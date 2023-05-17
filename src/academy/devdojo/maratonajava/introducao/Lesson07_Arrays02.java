package academy.devdojo.maratonajava.introducao;

public class Lesson07_Arrays02 {
    public static void main(String[] args) {
//        byte, short, int, long, float e double ... 0
//        char '\u0000'
//        boolean false
//        String null

        String[] names = new String[4];
        names[0] = "Java";
        names[1] = "Spring boot";
        names[2] = "MySQL";
        names[3] = "Heroku";

        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

    }
}
