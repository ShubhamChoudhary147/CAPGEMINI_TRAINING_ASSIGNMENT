class Student {
    int m1, m2, m3;

    Student(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

public class SelectionSortThreeMarks {
    public static void main(String[] args) {

        Student s = new Student(70, 40, 60);

        int[] marks = {s.m1, s.m2, s.m3};

        for (int i = 0; i < marks.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] < marks[min]) {
                    min = j;
                }
            }

            int temp = marks[i];
            marks[i] = marks[min];
            marks[min] = temp;
        }

        s.m1 = marks[0];
        s.m2 = marks[1];
        s.m3 = marks[2];

        System.out.println(s.m1 + " " + s.m2 + " " + s.m3);
    }
}
