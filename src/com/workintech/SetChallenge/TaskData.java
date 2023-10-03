package com.workintech.SetChallenge;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks  =new HashSet<>();
    private Set<Task> bobsTasks  =new HashSet<>();
    private Set<Task> carolsTasks  =new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public void setCarolsTasks(Set<Task> carolsTasks) {
        this.carolsTasks = carolsTasks;
    }
    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return getAnnsTasks();
            case "bob":
                return getBobsTasks();
            case "carol":
                return getCarolsTasks();
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(getAnnsTasks());
                allTasks.addAll(getBobsTasks());
                allTasks.addAll(getCarolsTasks());
                return allTasks;
            default:
                return null;
        }
    }

    public Set<Task> getUnion(Set<Task> taskes){
        Set<Task> unionsTasks = new HashSet<>();
        unionsTasks.addAll(taskes);
        return unionsTasks;
    }
    public Set<Task> getIntersect(Set<Task> task1 , Set<Task> task2){
        Set<Task> ıntersectTask = new HashSet<>(task1);
        ıntersectTask.retainAll(task2);
        return ıntersectTask;
    }
    public Set<Task> getDifference(Set<Task> task1 , Set<Task> task2){
        Set<Task> removedTasks = new HashSet<>(task1);
        removedTasks.removeAll(task2);
        return removedTasks;
    }

}
