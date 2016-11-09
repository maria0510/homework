import jelementary.*;
import jelementary.people.*;

public class Main {
	public static void main(String...args) {
	School sch = new School("Hillel", 2);
	
	Group g1 = new Group("Java Elementary", 3);
	Group g2 = new Group("English", 2);
	
    Student s1 = new Student("Maria", "Sergeeva", 27);
	Student s2 = new Student("Jane", "Own", 21);
	Student s3 = new Student("Samanta", "Smith", 28);
	
	System.out.println(sch.schoolname);
	g1.addstudent(s1);
	g1.addstudent(s2);
	g1.addstudent(s3);
	g2.addstudent(s1);
	g2.addstudent(s2);
	System.out.println(sch.addgroup(g2) + "\n" + g2);
	System.out.println(sch.addgroup(g1) + "\n" + g1);
	System.out.println(sch);
    }
}