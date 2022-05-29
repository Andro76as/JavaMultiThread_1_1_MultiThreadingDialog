public class MyThread extends Thread {

    public MyThread(ThreadGroup mainGroup, String name) {
        super(mainGroup, name);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен.\n", getName());
        }
    }
}
