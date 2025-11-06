package JavaCoreFoundations.day3;

public class AppendingString implements Runnable {

    private String taskName;
    private StringBuilder builder; // Objeto compartido

    public AppendingString(String taskName, StringBuilder builder) {
        this.taskName = taskName;
        this.builder = builder;
    }

    @Override
    public void run() {
        System.out.println("🚀 Starting: " + taskName);

        for (int i = 0; i < 100; i++) {
            builder.append(taskName.charAt(5)); // Agrega un carácter (el número de la tarea)
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("⚠️ Thread interrupted: " + taskName);
            }
        }

        System.out.println("✅ Finished: " + taskName);
    }
}
