package Interface;


public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Jay", 92);
        Student student2 = new Student("Sonu", 90);

        MarksComparator comparator = new MarksComparator();

        int result = comparator.compare(student1, student2);

        if (result > 0) {
            System.out.println("Higher");
        } else if (result < 0) {
            System.out.println("Less");
        } else {
            System.out.println("Equal");
        }
    }
}
