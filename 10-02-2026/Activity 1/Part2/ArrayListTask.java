import java.util.*;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(60);
        marks.add(85);
        marks.add(2, 70);
        int min = Collections.min(marks);
        marks.remove(Integer.valueOf(min));
        System.out.println("Final Marks List: " + marks);
    }
}
