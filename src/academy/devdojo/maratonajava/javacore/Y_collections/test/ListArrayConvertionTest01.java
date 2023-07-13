package academy.devdojo.maratonajava.javacore.Y_collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-----------------");
        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numbersArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arrayToList);

        System.out.println("----------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(15);
        System.out.println(numbersList);

        List<String> string = Arrays.asList("1", "2");
        System.out.println(string);
    }
}
