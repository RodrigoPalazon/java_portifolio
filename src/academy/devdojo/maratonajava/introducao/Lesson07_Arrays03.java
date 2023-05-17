package academy.devdojo.maratonajava.introducao;

public class Lesson07_Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 =new int[] {1, 2, 3, 4, 5};
        String[] names = {"Google", "Oracle", "W3C"};

        for (int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
        }

//        foreach
        System.out.println("For each loop:");
        for(int num:numbers3){
            System.out.println(num);
        }

        for(String name:names){
            System.out.println(name);
        }
    }
}
