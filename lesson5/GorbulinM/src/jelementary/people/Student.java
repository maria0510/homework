package jelementary.people;

public class Student
{
  String nameOfStudent;
  String surnameOfStudent;
  int courseOfStuding;

  public Student(String nameOfStudent, String surnameOfStudent, int courseOfStuding)
  {
    this.nameOfStudent = nameOfStudent;
    this.courseOfStuding = courseOfStuding;
    this.surnameOfStudent = surnameOfStudent;
  }

/*  public getInfOfStudent()
  {
    getNameOfStudent(String nameOfStudent);
    getYearOfStuding(int yearOfStuding);
  } */

  public String getNameOfStudent()
  {
    return nameOfStudent;
  }

  public String getSurnameOfStudent()
  {
    return surnameOfStudent;
  }

  public int getСourseOfStuding()
  {
    return courseOfStuding;
  }
}
