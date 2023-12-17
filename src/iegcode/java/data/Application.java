package iegcode.java.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakases Class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
