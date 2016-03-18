
public class sorted {

	private int ans;
	private int count;
	private int sum;
	sorted()
	{
	
	}
	
	public int sortedsequencelen(String source)
	{
	    int ans=0;
	    int count=1;
	    int sum=1;
		while(count<source.length()){
			
			if(source.charAt(count)>=source.charAt(count-1))
			{
				sum++;
			}
			else
			{
				ans+=(sum*(sum+1))/2;
				sum = 1;
			}
			count++;
		}
		ans += (sum*(sum+1))/2; 
		return ans;
	}
}
