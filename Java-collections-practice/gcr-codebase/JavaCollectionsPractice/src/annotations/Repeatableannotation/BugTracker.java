package annotations.Repeatableannotation;

class BugTracker {

    @BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI freezes on slow network")
    public void process() {
        System.out.println("Processing task");
    }
}
