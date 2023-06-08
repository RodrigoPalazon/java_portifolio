package academy.devdojo.maratonajava.javacore.O_exception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
    }

    /**
     *
     * @param a
     * @param b cannot be 0.
     * @return
     * @throws IllegalArgumentException case b == 0.
     */
    private static int division(int a, int b){
//        You can replace the try/catch beneath:

//        try{
//            return a/b;
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
//        return 0;

//        For this shape of error treatment. It's way better.
        if(b == 0){
            throw new IllegalArgumentException("Illegal Argument. 0 (zero) is not a divisible number.");
        }
        return a/b;
    }
}
