public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("run1");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("run2");
        runnableDemo2.start();
    }
}
