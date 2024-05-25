
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started");
		int lines=5;
		int starCount=1;
		int spaceCount=2;
		int mid=(lines+1)/2;
		
		for(int i=1; i<=lines; i++)
		{
			for (int j=1; j<=starCount; j++)
			{
				if(j==1||j==starCount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				for (int k=1; k<=spaceCount; k++)
				{
					if(k==1||k==starCount)
					{
						System.out.print(" ");	
					}
					
			
				
				
				
				System.out.println();
				if(i<mid)
				{
					starCount++;
					spaceCount--;
				
					
				}
				else
				{
					starCount--;
					spaceCount--;
				}
			}
		}
		System.out.println("program ended");

		}
	}
}


