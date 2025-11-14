package JavaCoreFoundations.day6;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<JobQ> jobs = new PriorityQueue<>();

        jobs.offer(new JobQ(5, "Get a Job", 5));
        jobs.offer(new JobQ(4, "enhance my development skills", 4));
        jobs.offer(new JobQ(3, "Boost my English", 3));
        jobs.offer(new JobQ(2, "Build confidence ", 2));
        jobs.offer(new JobQ(1, "Don't being silly", 1));

        while(!jobs.isEmpty()){
            JobQ jobQ = jobs.poll();
            System.out.println(jobQ.toString());
        }
    }
}
