package academy.devdojo.maratonajava.introducao;

public class Lesson08_MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};

        arrayInt[0] = new int[]{2, 3};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{13, 12, 4, 65, 6, 4, 23, 9};

//        Also possible
        int[][] arrayInt2 = {{1, 2}, {3, 4, 5}, {0, 9, 8, 7, 7, 6, 6, 5, 4, 3, 3}};

        for (int[] baseArray : arrayInt) {
            System.out.println("\n -----------");
            for (int num : baseArray) {
                System.out.print(num + " ");
            }
        }
    }
}
