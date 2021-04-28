package Test;

public class EvenThread extends Thread {
    public EvenThread() {

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + "" + i);
                }
            }
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}