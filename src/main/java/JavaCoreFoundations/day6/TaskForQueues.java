package JavaCoreFoundations.day6;

public class TaskForQueues {
    private int id;
    private String task;

    public TaskForQueues(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setId(int id) {
        this.id = id;
    }
}
