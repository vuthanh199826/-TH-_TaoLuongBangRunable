public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("creating" + threadName);
    }
    @Override
    public void run() {
        System.out.println("running  " + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println(threadName + " " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("error");
        }
        System.out.println(threadName + " exit" );

    }
    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
