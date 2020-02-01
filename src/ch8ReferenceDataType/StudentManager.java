package ch8ReferenceDataType;

public class StudentManager {
  public static void main(String[] args) {
    Student[] students = null;
    StudentManager manager = new StudentManager();
    students = manager.addStudents();
    manager.printStudent(students);
  }

  public Student[] addStudents() {
    Student[] students = new Student[3];
    students[0] = new Student("Lim");
    students[1] = new Student("Min");
    students[2] = new Student("Wow", "Seoul", "010-123-4567", "abc@abc.com");
    return students;
  }

  public void printStudent(Student... students) {
    for (Student student : students) {
      System.out.println(student.toString());
    }
  }
}
