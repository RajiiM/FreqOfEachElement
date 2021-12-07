public class Practice {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 10, 20, 30, 40, 50, 90};
		int freq[] = new int [a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			int no = a[i];
			int count = 1;
			
			for(int j = i+1;j<a.length;j++)
			{
				if(no==a[j])
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
        
		for(int i=0; i<a.length;i++)
		{
			if(freq[i]!=-1)
			System.out.println(a[i] + "occurs " + freq[i] + " times");
		}
	}
}

OUTPUT
10occurs 2 times
20occurs 2 times
30occurs 2 times
40occurs 1 times
50occurs 1 times
90occurs 1 times
