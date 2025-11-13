package JavaCoreFoundations.day6;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<TaskForQueues> tasks = new LinkedList<>();

        tasks.offer(new TaskForQueues(1, "Study JAVA"));
        tasks.offer(new TaskForQueues(2, "Study English"));
        tasks.offer(new TaskForQueues(3, "Go to work"));

        while (!tasks.isEmpty()){
            TaskForQueues currentTask = tasks.poll();
            System.out.println("Processing task: " + currentTask.getId() + ": " + currentTask.getTask());
        }
    }
}
