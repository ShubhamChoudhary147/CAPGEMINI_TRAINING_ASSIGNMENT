import java.util.*;
class Result {
    int sub1, sub2, sub3;

    public Result(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
}
public class BubbleSortThreeValues {

    public static void main(String[] args) {
        List<Result> data = new ArrayList<>();
        data.add(new Result(40, 60, 70));
        data.add(new Result(30, 80, 70));
        data.add(new Result(40, 50, 70));
        data.add(new Result(40, 60, 90));
        data.add(new Result(40, 100, 70));
        data.add(new Result(20, 60, 70));
        data.add(new Result(40, 60, 85));

        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {

                Result x = data.get(j);
                Result y = data.get(j + 1);

                if (x.sub1 > y.sub1 ||
                   (x.sub1 == y.sub1 && x.sub2 > y.sub2) ||
                   (x.sub1 == y.sub1 && x.sub2 == y.sub2 && x.sub3 > y.sub3)) {

                    data.set(j, y);
                    data.set(j + 1, x);
                }
            }
        }

        for (Result r : data) {
            System.out.println(r.sub1 + " " + r.sub2 + " " + r.sub3);
        }
    }
}
