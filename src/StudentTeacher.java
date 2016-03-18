import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class StudentTeacher {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Problem to find out mapping between Teacher and Student
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] lines = line.split("\\s");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int i=0;
		TreeMap<TeacherDetails,ArrayList<StudentDetails>> hm = new TreeMap<TeacherDetails,ArrayList<StudentDetails>>(); 
		for(i=0;i<N;i++){
		    String teacherName = br.readLine(); 	
		}
		
		for(i=0;i<M;i++)
		{
			String studentDetails = br.readLine();
			String[] Details = studentDetails.split("\\s");
			String Name = Details[0];
			TeacherDetails td = new TeacherDetails();
			td.setTeacherName(Name);
			StudentDetails sd = new StudentDetails();
			sd.setStudentName(Details[1]);
			sd.setStudentAge(Integer.parseInt(Details[2]));
			ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();
			if(!hm.containsKey(td))
			{
			   al.add(sd);	
			   hm.put(td,al);
			}
			else
			{  
			   ArrayList<StudentDetails> ar=  hm.get(td);	
			   ar.add(sd);
			   hm.put(td,ar);
			}  
		}
		  
		Set s = hm.entrySet();
		Iterator it  = s.iterator();
		while(it.hasNext())
		{
             Map.Entry m =(Map.Entry)it.next();		
             TeacherDetails td = (TeacherDetails) m.getKey();
             System.out.print(td.getTeacherName());
             ArrayList<StudentDetails> details =  (ArrayList<StudentDetails>) m.getValue();
             for(StudentDetails sd: details)
             System.out.println(" " + sd.getStudentName() +" " + sd.getStudentAge());
		}
		}
		 
		

	}


