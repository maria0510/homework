package jelementary.people;

public class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  
  public String toString() {
    return "Student: " + name;
  }
}
