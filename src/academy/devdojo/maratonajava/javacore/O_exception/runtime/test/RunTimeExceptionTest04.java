package academy.devdojo.maratonajava.javacore.O_exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
         try{
             throw new RuntimeException();
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Within ArrayIndexOutOfBoundsException");
         }catch (IndexOutOfBoundsException e){
             System.out.println("Within IndexOutOfBoundsException");
         }catch (IllegalArgumentException e){
             System.out.println("Within IllegalArgumentException");
         }catch (ArithmeticException e){
             System.out.println("Within ArithmeticException");
         }catch (RuntimeException e){
             System.out.println("Within ArrayIndexOutOfBoundsException");
         }

         try {
             maybeLaunchException();
         }catch (SQLException e){

         }catch (FileNotFoundException e){

         }
    }

    private static void maybeLaunchException() throws SQLException, FileNotFoundException {

    }
}
