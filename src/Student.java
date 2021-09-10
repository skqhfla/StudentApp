public class Student implements Comparable<Student>{
   int no;
   String name;
   int age;
   
   public Student(int i, String string, int j) {
      no = i;
      name = string;
      age = j;
   }
   
   @Override
   public int compareTo(Student o) {
      return name.compareTo(o.name);
   }

   @Override
   public String toString() {
      return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
   }
}