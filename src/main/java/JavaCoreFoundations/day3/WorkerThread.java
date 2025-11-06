package JavaCoreFoundations.day3;

public class WorkerThread implements Runnable {

    private String name;

    WorkerThread(String name){
        this.name = name;
    }

    @Override
    public void run(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo: " + this.name + " #" + i);
            System.out.println("Inside WorkerThread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted" + e.getMessage());
                return;
            }
        }
        System.out.println("Thread finished: " + name);
    }

}
