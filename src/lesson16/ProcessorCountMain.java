package lesson16;

public class ProcessorCountMain {

    public static void main(String[] args) {
        //counting the number of processors
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor Count:" + count);
    }
}