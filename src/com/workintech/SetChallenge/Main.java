package com.workintech.SetChallenge;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("A PROJECT", "EXAMPLE SOLUTION", "Ann", Priority.HIGHT, Status.ASSIGNED);
        Task task2 = new Task("B Project", "EXAMPLE 2 ", "Bob", Priority.LOW, Status.IN_PROGRESS);
        Task task3 = new Task("C Project", "Write ","Carol", Priority.MED, Status.IN_QUEUE);
        Task task4 = new Task("D Project", "Write LinkedList","Carol", Priority.MED, Status.IN_QUEUE);
        Task task5 = new Task("E Project", "Write HashSet","Carol", Priority.MED, Status.IN_QUEUE);
        Task task6 = new Task("F Project", "Write Collections","Carol", Priority.MED, Status.IN_QUEUE);
        Task task7 = new Task("Q Project", "Write Examples","Carol", Priority.MED, Status.IN_QUEUE);

        Set<Task> totalTasks = new LinkedHashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);
        totalTasks.add(task7);


        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task2);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(task3);
        bobsTasks.add(task4);
        bobsTasks.add(task5);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(task6);
        carolsTasks.add(task7);


        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTask, bobsTasks, carolsTasks);

        System.out.println("All tasks: ");
        System.out.println(taskData.getTasks("all"));

        System.out.println("***********************");

        System.out.println("Ann's task: ");
        System.out.println(taskData.getTasks("ann"));
        System.out.println("***********************");

        System.out.println("Bob's task: ");
        System.out.println(taskData.getTasks("bob"));
        System.out.println("***********************");

        System.out.println("Carol's task: ");
        System.out.println(taskData.getTasks("carol"));
        System.out.println("***********************");

        System.out.println(taskData.getIntersect(annsTask,bobsTasks));

        System.out.println(taskData.getDifference(totalTasks, taskData.getTasks("all")));
    }
}