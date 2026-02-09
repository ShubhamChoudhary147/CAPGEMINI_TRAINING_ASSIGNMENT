class Student1 {
    int m1, m2, m3;

    Student1(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

public class InsertionSortThreeValues {

	public static void main(String[] args) {
		Student1 s = new Student1(70, 40, 60);

        int[] marks = {s.m1, s.m2, s.m3};

        for (int i = 1; i < marks.length; i++) {
            int key = marks[i];
            int j = i - 1;

            while (j >= 0 && marks[j] > key) {
                marks[j + 1] = marks[j];
                j--;
            }
            marks[j + 1] = key;
        }

        s.m1 = marks[0];
        s.m2 = marks[1];
        s.m3 = marks[2];

        System.out.println("Sorted Marks:");
        System.out.println(s.m1 + " " + s.m2 + " " + s.m3);
	}

}
