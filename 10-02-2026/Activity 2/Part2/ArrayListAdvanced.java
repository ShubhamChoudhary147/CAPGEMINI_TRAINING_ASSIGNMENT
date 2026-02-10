import java.util.*;

public class ArrayListAdvanced {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        list.removeIf(n -> n % 2 == 0);
        int max = Collections.max(list);
        int min = Collections.min(list);
        list.sort(Collections.reverseOrder());
        System.out.println("Final List: " + list);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
