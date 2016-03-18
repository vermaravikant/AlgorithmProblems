import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SortedLength {
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases= Integer.parseInt(br.readLine());
		sorted s = new sorted();
		
		while(testcases>0)
		{
			int len= Integer.parseInt(br.readLine());
			String source = br.readLine();
			System.out.println(s.sortedsequencelen(source));
			testcases--;
		}
		
		
	}
	

}
