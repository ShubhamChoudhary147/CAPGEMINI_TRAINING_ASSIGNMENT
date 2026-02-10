import java.util.*;

public class HospitalQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Aman");
        queue.add("Ravi");
        queue.add("Simran");
        queue.add("Karan");
        queue.add("Neha");

        queue.addFirst("Emergency_Patient");
        queue.removeFirst();
        queue.removeFirst();

        System.out.println("Current Queue: " + queue);
    }
}
