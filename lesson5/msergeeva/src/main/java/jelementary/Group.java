import jelementary.people.*;

public class Group {
	public String groupname;
	public int count;
	public String student;
	public String[] g;
    public int j = 0;
	
	public Group (String groupname, int count) {
	   this.groupname = groupname;
	   g = new String[count];
	}
	
	public void addstudent(Student s) {
	  student = " " + s.name + " " + s.surname + " age:" + s.age;
	  g[j] = student;
	  j++;
	}
	public String toString() {
	    String w = "";
		for (int i = 0; i < g.length; i++) {
		    w += g[i] + "\n";
		}
	    return w;
	}
}