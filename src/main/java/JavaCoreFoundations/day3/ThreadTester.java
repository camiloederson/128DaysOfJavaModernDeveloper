package JavaCoreFoundations.day3;

public class ThreadTester {
    public static void main(String[] args){

        WorkerThread w1 = new WorkerThread("First Task");
        WorkerThread w2 = new WorkerThread("Second Task");
        WorkerThread w3 = new WorkerThread("Third Task");

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("✅. Main thread has finished");
    }
}
