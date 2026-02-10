import java.util.*;
public class TicketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Aman");
        queue.add("Riya");
        queue.add("Karan");
        queue.add("Neha");
        queue.add("Raj");
        queue.poll();
        queue.poll();
        System.out.println("Remaining Queue: " + queue);
    }
}
