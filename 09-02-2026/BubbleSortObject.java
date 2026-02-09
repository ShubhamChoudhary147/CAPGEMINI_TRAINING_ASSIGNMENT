import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Stu {
    int rollNo;
    String name;

    public Stu(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class BubbleSortObject {
    public static void main(String args[]) {

        List<Stu> l = new ArrayList<>();
        l.add(new Stu(1, "Rahul"));
        l.add(new Stu(10, "Neha"));
        l.add(new Stu(2, "Vikas"));
        l.add(new Stu(5, "Pooja"));
        l.add(new Stu(6, "Sahil"));
        l.add(new Stu(15, "Karan"));

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size() - i - 1; j++) {
                if (l.get(j).rollNo > l.get(j + 1).rollNo) {
                    Stu t = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, t);
                }
            }
        }

        for (Stu h : l) {
            System.out.print(h.rollNo + " ");
            System.out.println(h.name);
        }
    }
}
