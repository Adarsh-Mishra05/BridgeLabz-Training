package Week3.AVLTree.Onlineticketbooking;

public class EventNode {
    int startTime; 
    String eventName;
    int height;

    EventNode left, right;

    public EventNode(String eventName, int startTime) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.height = 1;
    }
}
