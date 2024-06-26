package Interface;
import java.util.Comparator;
public class MarksComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.getMarks() > s2.getMarks()) {
            return 1;
        } else if (s1.getMarks() < s2.getMarks()) {
            return -1;
        } else {
            return 0;
        }
    }
}

