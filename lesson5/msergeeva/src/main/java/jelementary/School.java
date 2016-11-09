import jelementary.*;

public class School {
	public String schoolname;
	public int count;
	public String group;
	public String[] s;
	public int j = 0;
	
	public School (String schoolname, int count) {
	   this.schoolname = schoolname; 
       s = new String[count];	   
	}
	public String addgroup(Group g) {
	  group = "Group: " + g.groupname;
	  s[j] = group;
	  j++;
	  return group;  
	}
	public String toString() {
	    String w = "";
		for (int i = 0; i < s.length; i++) {
		    w += s[i] + "\n";
		}
	    return w;
	}
}