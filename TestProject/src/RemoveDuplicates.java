import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String [] strArray = {"A","C","D","A","B","C","A"};
		Set set = new TreeSet();
		
		for(int i=0;i<strArray.length;i++)
		{
			if(!set.contains(strArray[i]))
			{
				set.add(strArray[i]);
			}
		}
		System.out.println(set);
		

	}

}
