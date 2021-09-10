import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
      
      List<Student> al = new ArrayList<Student>();
      System.out.println("Student List (ordered by name)");
      Student s1 = new Student(101, "Kim", 23);
      al.add(s1);
      Student s2 = new Student(102, "Choi", 25);
      al.add(s2);
      al.add(new Student(103, "Park", 20));
      al.add(new Student(104, "Na", 30));
      al.add(new Student(105, "U", 28));
      al.add(new Student(106, "Bin", 19));
      al.add(new Student(107, "No", 36));
      al.add(new Student(108, "Ha", 26));
      al.add(new Student(109, "Ho", 27));
      al.add(new Student(110, "Song", 29));
      
      Collections.sort(al);
      
      for(Student s : al) {
         System.out.println(s.toString());
      }
      System.out.println("Student List (reverse ordered by name)");
      
      Collections.sort(al, Collections.reverseOrder());
      
      for(int i = 0; i<al.size(); i++) {
         System.out.println(al.get(i).toString());
      }
   }
}