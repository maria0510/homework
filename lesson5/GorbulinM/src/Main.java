import jelementary.*;
import jelementary.people.*;
import java.util.ArrayList;

public class Main
{
  public static void main(String ...args)
  {
    School inf21 = new School("School", 133);
    inf21.addSchool(inf21);
    School inf22 = new School("Gymnasium", 8);
    inf22.addSchool(inf22);

    Group inf11 = new Group("Math", 1);
    inf21.addGroup(inf11);
    inf22.addGroup(inf11);
    Group inf12 = new Group("English", 2);
    inf21.addGroup(inf12);
    Group inf13 = new Group("Russian", 2);
    inf22.addGroup(inf13);

    Student inf31 = new Student("Bob","Ivao", 5);
    inf11.addStudent(inf31);
    inf12.addStudent(inf31);
    Student inf32 = new Student("Kiril","Asch", 2);
    inf12.addStudent(inf32);
    Student inf33 = new Student("Elena","Rok", 1);
    inf11.addStudent(inf33);
    Student inf34 = new Student("Vasya","Katovsk", 3);
    inf13.addStudent(inf34);

    System.out.println("\n" + "Выведем всю информацию об учебных заведениях :");
    ArrayList<School> schools1 = inf21.getInfoAboutSchool();
    for(int k = 0; k < schools1.size(); k++)
    {
      School sch = schools1.get(k);
      System.out.println("-" + sch.getNameOfSchool() + " №" + sch.getNumberOfSchool());
      ArrayList<Group> group1 = inf21.getInfoAboutGroup();
      for(int j = 0; j < group1.size(); j++)
      {
        Group gro = group1.get(j);
        System.out.println("  group " + "№" + gro.getNumberOfGroup() + " " + gro.getNameOfGroup());
        ArrayList<Student> students = gro.getInfoAboutStudent();
        for(int i = 0; i < students.size(); i++)
        {
          Student stu = students.get(i);
          System.out.println("   student " + stu.getСourseOfStuding() + " course : " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent());
        }
      }
    }
    ArrayList<School> schools2 = inf22.getInfoAboutSchool();
    for(int k = 0; k < schools2.size(); k++)
    {
      School sch = schools2.get(k);
      System.out.println("-" + sch.getNameOfSchool() + " №" + sch.getNumberOfSchool());
      ArrayList<Group> group2 = inf22.getInfoAboutGroup();
      for(int j = 0; j < group2.size(); j++)
      {
        Group gro = group2.get(j);
        System.out.println("  group " + "№" + gro.getNumberOfGroup() + " " + gro.getNameOfGroup());
        ArrayList<Student> students = gro.getInfoAboutStudent();
        for(int i = 0; i < students.size(); i++)
        {
          Student stu = students.get(i);
          System.out.println("   student " + stu.getСourseOfStuding() + " course : " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent());
        }
      }
    }

    System.out.println("\n" + "Выведем информацию только о группах :");
    ArrayList<Group> group = inf21.getInfoAboutGroup();
    for(int j = 0; j < group.size(); j++)
    {
      Group gro = group.get(j);
      System.out.println("  group " + "№" + gro.getNumberOfGroup() + " " + gro.getNameOfGroup());
      ArrayList<Student> students = gro.getInfoAboutStudent();
      for(int i = 0; i < students.size(); i++)
      {
        Student stu = students.get(i);
        System.out.println("   student " + stu.getСourseOfStuding() + " course : " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent());
      }
    }
    group = inf22.getInfoAboutGroup();
    for(int j = 0; j < group.size(); j++)
    {
      Group gro = group.get(j);
      System.out.println("  group " + "№" + gro.getNumberOfGroup() + " " + gro.getNameOfGroup());
      ArrayList<Student> students = gro.getInfoAboutStudent();
      for(int i = 0; i < students.size(); i++)
      {
        Student stu = students.get(i);
        System.out.println("   student " + stu.getСourseOfStuding() + " course : " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent());
      }
    }

    System.out.println("\n" + "Выведем информацию только о студентах");
    ArrayList<Student> students = inf11.getInfoAboutStudent();
    for(int i = 0; i < students.size(); i++)
    {
      Student stu = students.get(i);
      System.out.println(" student " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent() + " course " + stu.getСourseOfStuding());
    }
    students = inf12.getInfoAboutStudent();
    for(int i = 0; i < students.size(); i++)
    {
      Student stu = students.get(i);
      System.out.println(" student " + stu.getNameOfStudent() + " " + stu.getSurnameOfStudent() + " course " + stu.getСourseOfStuding());
    }
  }
}
