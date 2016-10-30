package jelementary;
import java.util.ArrayList;

public class School
{
  ArrayList<School> school = new ArrayList<School>();
  ArrayList<Group> group = new ArrayList<Group>();
  int numberOfSchool;
  String nameOfSchool;

  public void addSchool(School sch)
  {
    school.add(sch);
  }

  public ArrayList<School> getInfoAboutSchool()
  {
    return school;
  }

  public void addGroup(Group gro)
  {
    group.add(gro);
  }

  public ArrayList<Group> getInfoAboutGroup()
  {
    return group;
  }

  public School(String nameOfSchool, int numberOfSchool)
  {
    this.numberOfSchool = numberOfSchool;
    this.nameOfSchool = nameOfSchool;
  }

  public String getNameOfSchool()
  {
    return nameOfSchool;
  }

  public int getNumberOfSchool()
  {
    return numberOfSchool;
  }
}
