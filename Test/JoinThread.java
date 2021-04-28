package Test;

public class JoinThread extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + "" + i);
                }

            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}