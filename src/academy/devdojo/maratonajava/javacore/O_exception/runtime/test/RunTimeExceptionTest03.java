package academy.devdojo.maratonajava.javacore.O_exception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConection();
        openConection2();
    }

    private static String openConection() {
        try{
            System.out.println("Opening a File.");
            System.out.println("Writing data in a File.");
            return "Opened Connection";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("closing feature released by OS");
        }
        return null;
    }

//    Quite specific, but possible use is...f
    private static String openConection2() {
        try{
            System.out.println("Opening a File.");
            System.out.println("Writing data in a File.");
            throw new RuntimeException();
        }finally {
            System.out.println("closing feature released by OS");
        }
    }
}
