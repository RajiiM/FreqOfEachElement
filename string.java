OUTPUT:
R occurs 1 times
a occurs 1 times
j occurs 1 times
i occurs 2 times
-----------
public class Practice {

	public static void main(String[] args) {
		String name = "Rajii";
		char char_array[] = name.toCharArray();
		int[] freq = new int[char_array.length];
		
		for(int i = 0; i < name.length(); i++)
		{
			int letter = char_array[i];
			int count = 1;
			
			for(int j = i+1;j<name.length();j++)
			{
				if(letter==char_array[j])
				{
					count++;
					freq[j]=-1;
				}				
			}
			
			if(freq[i]!=-1)
			{
			freq[i]=count;
			}
		}
        
		for(int i=0; i<name.length();i++)
		{
			if(freq[i]!=-1)
			System.out.println(char_array[i] + " occurs " + freq[i] + " times");
		}
	}
}
