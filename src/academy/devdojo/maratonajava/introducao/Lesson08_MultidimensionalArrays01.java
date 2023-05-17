package academy.devdojo.maratonajava.introducao;

public class Lesson08_MultidimensionalArrays01 {
    public static void main(String[] args) {


        int[][] days = new int[3][3];
        days[0][0] = 0;
        days[0][1] = 0;
        days[0][2] = 0;

        days[1][0] = 1;
        days[1][1] = 1;
        days[1][2] = 1;

        days[2][0] = 2;
        days[2][1] = 2;
        days[2][2] = 2;

        for(int i = 0 ; i< days.length; i++){
            for(int j=0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }


//        for each
        System.out.println("For each array:");
        for(int[] baseArray: days){
             for(int num: baseArray) {
                 System.out.println(num);
             }
        }
    }
}
