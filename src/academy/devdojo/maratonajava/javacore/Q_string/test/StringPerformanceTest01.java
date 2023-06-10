package academy.devdojo.maratonajava.javacore.Q_string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(10_000);
        long end = System.currentTimeMillis();
        System.out.println("Expended time to String " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(10_000);
        end = System.currentTimeMillis();
        System.out.println("Expended time to StringBuilder " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(10_000);
        end = System.currentTimeMillis();
        System.out.println("Expended time to StringBuffer " + (end - begin) + " ms");
    }

    private static void concatString(int size){
        String text = "";
        for(int i=0; i<size; i++){
            text += i;
        }
    }

    private static void concatStringBuilder(int size){
        StringBuilder sb = new StringBuilder(size);
        for(int i=0; i<size; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer sb = new StringBuffer(size);
        for(int i=0; i<size; i++){
            sb.append(i);
        }
    }
}
