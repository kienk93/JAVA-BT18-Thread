package Test;

public class NumberGenerator implements Runnable{
    private Thread abc;
    String threadname;

    public NumberGenerator(String threadname) {
        this.threadname = threadname;
        System.out.println("creating new thread " + threadname);
    }
    public void start(){
        this.abc.start();
    }
    @Override
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "(" + this.hashCode() + ")");
                Thread.sleep(500);

            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("my thread is run over");
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator("a");
        NumberGenerator numberGenerator1 = new NumberGenerator("b");
        Thread a = new Thread(numberGenerator);
        Thread b = new Thread(numberGenerator1      );
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
    }
}