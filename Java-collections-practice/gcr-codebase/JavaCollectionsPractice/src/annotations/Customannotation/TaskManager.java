package annotations.Customannotation;

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Harsh")
    public void completeTask() {
        System.out.println("Task is being completed");
    }
}
