class Student {
    int id, marks;

    Student(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }
}

public class SelectionSortObject {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, 85),
            new Student(2, 60),
            new Student(3, 90)
        };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].marks < arr[min].marks) {
                    min = j;
                }
            }

            Student temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (Student s : arr) {
            System.out.println(s.id + " " + s.marks);
        }
    }
}
