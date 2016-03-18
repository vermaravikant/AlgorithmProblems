
public class TeacherDetails implements Comparable<TeacherDetails> {
     private String TeacherName;
     
     public String getTeacherName()
 	{
 		return TeacherName;
 	}
 	public void setTeacherName(String TeacherName)
 	{
 		this.TeacherName = TeacherName;
 		
 	}
	@Override
	public int compareTo(TeacherDetails o) {
		// TODO Auto-generated method stub
		
		return this.TeacherName.compareTo(o.TeacherName);
	}
}
