package JavaCoreFoundations.day6;

public class JobQ implements Comparable<JobQ> {

    private final int id;
    private final String name;
    private final int priority;

    public JobQ(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(JobQ jobQ) {
        if (this.priority == jobQ.priority) return 0;
        else if (this.priority > jobQ.priority) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "JobQ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
