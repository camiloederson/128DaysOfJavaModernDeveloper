package JavaCoreFoundations.day3;

public class RaceConditionDemo {
    public static void main(String[] args) {

        // Objeto compartido (puedes cambiarlo a StringBuffer para comparar)
        StringBuilder shared = new StringBuilder();

        // Dos tareas que comparten el mismo objeto
        AppendingString task1 = new AppendingString("Task 1", shared);
        AppendingString task2 = new AppendingString("Task 2", shared);

        // Creación de los hilos
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Ejecución
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ Main thread has finished.");
        System.out.println("🧾 Final content: " + shared);
    }
}
