package jelementary;
import jelementary.people.*;
import java.util.ArrayList;

public class Group
{
  ArrayList<Student> students = new ArrayList<Student>();
  String nameOfGroup;
  int numberOfGroup;

  public void addStudent(Student stu)
  {
    students.add(stu);
  }

  public ArrayList<Student> getInfoAboutStudent()
  {
    return students;
  }

  public Group(String nameOfGroup, int numberOfGroup)
  {
    this.nameOfGroup = nameOfGroup;
    this.numberOfGroup = numberOfGroup;
  }

  public String getNameOfGroup()
  {
    return nameOfGroup;
  }

  public int getNumberOfGroup()
  {
    return numberOfGroup;
  }
}
