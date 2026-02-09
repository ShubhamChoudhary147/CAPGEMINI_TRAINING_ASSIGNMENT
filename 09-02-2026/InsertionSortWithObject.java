class Stud {
    int id;
    int marks;

    Stud(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }
}

public class InsertionSortWithObject {

	public static void main(String[] args) {
		Stud[] arr = {
	            new Stud(1, 85),
	            new Stud(2, 60),
	            new Stud(3, 90),
	            new Stud(4, 70)
	        };

	        for (int i = 1; i < arr.length; i++) {
	            Stud key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].marks > key.marks) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
	        for (Stud s : arr) {
	            System.out.println("ID: " + s.id + ", Marks: " + s.marks);
	        }
	}

}
